package com.mimacom.rety.batch;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String getStatus() {
        return "OK";
    }

}
