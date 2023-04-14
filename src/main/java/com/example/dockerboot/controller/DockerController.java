package com.example.dockerboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author name: tanbingshi
 * create time: 2022/11/2 10:12
 * describe content: docker-boot
 */
@RestController
@RequestMapping(value = "/docker")
public class DockerController {

    @RequestMapping(value = "/index")
    public String index() {

        return "hello, docker index";
    }

}
