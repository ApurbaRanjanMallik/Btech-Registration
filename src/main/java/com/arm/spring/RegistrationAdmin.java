package com.arm.spring;

public class RegistrationAdmin {
    private IBranch branch;

    public void setBranch(IBranch branch) {
        this.branch = branch;
    }

    public void allocateBranch(String branchForReg){
        String branchAllocated = branch.doRegistration(branchForReg);
        if ("Civil".equals(branchAllocated)){
            System.out.println("You are allocated for Civil Branch");
        } else if ("Mechanical".equals(branchAllocated)) {
            System.out.println("You are allocated for Mechanical Branch");
        } else if ("ComputerScience".equals(branchAllocated)) {
            System.out.println("You are allocated for Mechanical Branch");
        }else{
            System.out.println("You not allocated for any branch");
        }
    }
}
