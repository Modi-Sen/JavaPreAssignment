package com.sample.java.preassignment.pre_assignment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import com.sample.java.preassignment.pre_assignment.bean.ComputationResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private ProcessInputStringService processInputStringService;

    @GetMapping(path="/output/{input}")
    public ComputationResult calculate(@PathVariable String input){

        return  processInputStringService.processString(input);
    }
}
