package com.SpringBoot.Basic.model;

import org.springframework.context.annotation.Primary;

public class Desktop implements Computer {

    @Override
    @Primary
    public void compile() {
        System.out.println("Compile in Desktop..");
    }
}
