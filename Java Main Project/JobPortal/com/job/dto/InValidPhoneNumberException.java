package com.job.dto;

public class InValidPhoneNumberException extends Exception{
    public InValidPhoneNumberException(String msg){
        super(msg);
    }
}
