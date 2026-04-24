package com.job.dto;

public class InValidEmailException extends Exception{
    public InValidEmailException(String msg){
        super(msg);
    }
}
