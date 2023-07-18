package com.arm.spring;

public class Mechanical implements IBranch{
    @Override
    public String doRegistration(String branch) {
        System.out.println("You have registered successfully in Mechanical branch");
        return branch;
    }
}
