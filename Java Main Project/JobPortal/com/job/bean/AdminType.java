
package com.job.bean;

import java.util.ArrayList;


public class AdminType {
    private ArrayList<Admin> arr;
    private boolean declareResult = false;

    public AdminType(){
        arr=new ArrayList<>(3);
        loadAdmins();
    }

    public boolean getResultStatus(){
        return declareResult;
    }

    public void setResultStatus(){
        declareResult = false;
    }

    public void loadAdmins(){
        arr.add(new Admin("Sanket", "8080887488", "sanketmusale324@gmail.com", "123"));
        arr.add(new Admin("Jayesh", "8591471877", "jayeshdpatil2021@gmail.com", "456"));
    }

    public ArrayList<Admin> getAdminList(){
        return arr;
    }
}
