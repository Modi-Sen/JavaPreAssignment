package com.sample.java.preassignment.pre_assignment.bean;

import java.util.ArrayList;
import java.util.List;


public class ComputationResult {

    private int result=0;
    private List<String> allInputs =new ArrayList<>();
    private  String acceptedInputs=new String();

    public ComputationResult() {
        this.result = result;
        this.allInputs = allInputs;
        this.acceptedInputs = acceptedInputs;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public List<String> getAllInputs() {
        return allInputs;
    }

    public void setAllInputs(List<String> allInputs) {
        this.allInputs = allInputs;
    }

    public String getAcceptedInputs() {
        return acceptedInputs;
    }

    public void setAcceptedInputs(String acceptedInputs) {
        this.acceptedInputs = acceptedInputs;
    }

    @Override
    public String toString() {
        return "computationResult{" +
                "result=" + result +
                ", allInputs=" + allInputs +
                ", acceptedInputs='" + acceptedInputs + '\'' +
                '}';
    }
}
