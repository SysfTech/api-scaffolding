package com.sysftech.open.apiscaffolding.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping(path = "/v1", produces = "application/hal+json")
public class IndexController {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello world!";
    }
}
