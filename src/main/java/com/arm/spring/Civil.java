package com.arm.spring;

import java.sql.SQLOutput;

public class Civil implements IBranch{
    @Override
    public String doRegistration(String branch) {
        System.out.println("You have registered successfully in Civil branch");
        return branch;
    }
}
