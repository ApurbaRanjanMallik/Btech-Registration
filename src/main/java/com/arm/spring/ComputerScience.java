package com.arm.spring;

public class ComputerScience implements IBranch{
    @Override
    public String doRegistration(String branch) {
        System.out.println("You have registered successfully in ComputerScience branch");
        return branch;
    }
}
