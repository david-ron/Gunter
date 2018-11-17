package controller;


import model.Resume;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
public class RequestController {

    private Logger logger = LoggerFactory.getLogger(RequestController.class);


    @RequestMapping(value = "/test", method = RequestMethod.GET)

    public String test(@RequestParam("test") String testString){
        logger.info("Something received: " + testString);

        return testString;
    }


    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public void translate(@RequestBody Resume resume){
        //TODO


        return;
    }
}
