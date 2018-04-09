package com.mycena.controller;

import com.mycena.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jihung on 3/30/18.
 */

@RestController
@RequestMapping("/api")
public class SampleController {

    @Autowired
    SampleService sampleService;

    @RequestMapping(value = "/content")
    private ResponseEntity<String> getContent() {
        return sampleService.getContent();
    }

    @RequestMapping(value = "/userContent")
    private ResponseEntity<String> getUserContent() {
        return sampleService.getUserContent();
    }

}
