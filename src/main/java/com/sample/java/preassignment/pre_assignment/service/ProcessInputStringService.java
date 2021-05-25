package com.sample.java.preassignment.pre_assignment.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sample.java.preassignment.pre_assignment.bean.ComputationResult;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class ProcessInputStringService {

    public ComputationResult processString(String input){

        ComputationResult computationResult = new ComputationResult();
        List<String> allInputs = Arrays.asList(input.split(","));

        String strArray[] = input.split("\\D+");
        String acceptedInputs=Arrays.toString(strArray);


        int[] array = Arrays.asList(strArray).stream().mapToInt(Integer::parseInt).toArray();
        int result = Arrays.stream(array).sum();

        computationResult.setAllInputs(allInputs);
        computationResult.setAcceptedInputs(acceptedInputs);
        computationResult.setResult(result);


        return computationResult;
    }
}
