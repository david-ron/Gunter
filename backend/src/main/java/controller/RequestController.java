package controller;


import model.Resume;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.File;

@RestController
public class RequestController {

    private Logger logger = LoggerFactory.getLogger(RequestController.class);


    @RequestMapping(value = "/test", method = RequestMethod.GET)

    public String test(@RequestParam("test") String testString){
        logger.info("Something received: " + testString);

        return testString;
    }


    @RequestMapping(value = "/upload", produces = { "application/json" }, method = RequestMethod.POST)
    public @ResponseBody ResponseEntity translate(@RequestBody Resume resume){
        
        translateReseum(resume);
        String filename = "test.pdf";


        Generator generator = new Generator(filename);
        generator.setResume(resume);
        try {
            generator.generate();
        } catch (IOException ex){
            ex.getStackTrace();
        } catch (DocumentException ex){
            ex.getStackTrace();
        }

        String filename = "test.pdf";
        byte[] out = new byte[10];

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.add("content-disposition", "attachment; filename=" + filename);
        responseHeaders.add("Content-Type", "pdf");

        return new ResponseEntity(out, responseHeaders, HttpStatus.OK);
    }
    
    private void translateReseum(Resume resume){
        Transfer transfer = new Transfer();

        for(WorkExperience key : resume.getWorkExperience()){
            key.companyName = transfer.toEnglish(key.companyName);
            key.description = transfer.toEnglish(key.description);
        }

        for (EducationBackground key : resume.getEducationBackground()){
            key.schoolName = transfer.toEnglish(key.schoolName);
            key.degree = transfer.toEnglish(key.degree);
        }

        for(HonoraryAndAward key : resume.getHonoraryAndAward()){
            key.award = transfer.toEnglish(key.award);
            key.competitionName = transfer.toEnglish(key.competitionName);
        }

        resume.setSelfIntroduction(transfer.toEnglish(resume.getSelfIntroduction()));

        resume.setAddress(transfer.toEnglish(resume.getAddress()));

    }
}
