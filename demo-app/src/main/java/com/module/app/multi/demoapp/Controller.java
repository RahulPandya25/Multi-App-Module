package com.module.app.multi.demoapp;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo-app")
// TODO: restrict this
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class Controller {
    @GetMapping("/hi")
    private String getString(){
        return "HelloWorld";
    }
}
