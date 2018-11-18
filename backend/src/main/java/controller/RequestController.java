package controller;


import Generator.Generator;
import com.itextpdf.text.DocumentException;
import model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.IOException;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
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

        logger.info(resume.getFirstName());
        logger.info(resume.getLastName());


        Generator generator = new Generator(filename);
        generator.setResume(resume);
        try {
            generator.generate();
        } catch (IOException ex){
            ex.getStackTrace();
        } catch (DocumentException ex){
            ex.getStackTrace();
        }


        byte[] out = new byte[10];

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.add("content-disposition", "attachment; filename=" + filename);
        responseHeaders.add("Content-Type", "application/pdf");

        return new ResponseEntity(out, responseHeaders, HttpStatus.OK);
    }
    
    private void translateReseum(Resume resume){
        Transfer transfer = new Transfer();

        for(WorkExperience key : resume.getWorkExperience()){
            key.setCompanyName(transfer.toEnglish(key.getCompanyName()));
            key.setDescription(transfer.toEnglish(key.getDescription()));
        }

        for (EducationBackground key : resume.getEducationBackground()){
            key.setSchoolName(transfer.toEnglish(key.getSchoolName()));
            key.setDegree(transfer.toEnglish(key.getDegree()));
        }

        for(HonoraryAndAward key : resume.getHonoraryAndAward()){
            key.setAward(transfer.toEnglish(key.getAward()));
            key.setCompetitionName(transfer.toEnglish(key.getCompetitionName()));
        }

        resume.setSelfIntroduction(transfer.toEnglish(resume.getSelfIntroduction()));

        resume.setAddress(transfer.toEnglish(resume.getAddress()));

    }
}
