package com.springboot.dockerDeployment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("name" )
    public String projectName(){
       return "Hello, I am a springboot project deployed using Docker";
    }
}
