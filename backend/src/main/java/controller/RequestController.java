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
        //TODO

        String filename = "test.pdf";
        byte[] out = new byte[10];

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.add("content-disposition", "attachment; filename=" + filename);
        responseHeaders.add("Content-Type", "pdf");


        return new ResponseEntity(out, responseHeaders, HttpStatus.OK);
    }
}
