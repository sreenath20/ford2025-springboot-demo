package com.may12.demo;


import org.springframework.stereotype.Component;

@Component // Inversion of control
public class DemoServiceImpl implements DemoService
{
    @Override
    public String info() {
        return "Ford India";
    }
}
