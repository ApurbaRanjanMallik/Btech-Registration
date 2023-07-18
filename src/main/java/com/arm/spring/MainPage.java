package com.arm.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainPage {
    public static void main(String[] args)
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        RegistrationAdmin admin= (RegistrationAdmin) context.getBean("regAdmin");
        admin.allocateBranch("Civil");
    }
}