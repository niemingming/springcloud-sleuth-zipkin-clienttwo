package com.nmm.study.controllerr;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SleuthController {

    @ResponseBody
    @RequestMapping("/sayHello/{name}")
    public String sayHello(@PathVariable String name) {
        return "hello,this is server two " + name;
    }
}
