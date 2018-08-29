package com.example.springboot.impl;

import com.example.api.ProviderService;


public class ProviderServiceImpl implements ProviderService{
    @Override
    public String check(String name) {
        if("Kobe".equals(name)){
            return "You choose 13rd rookie Kobe";
        }else if("Leborn".equals(name)){
            return "You choose 1st rookie Leborn";
        }else {
            return "You choose nothing";
        }
    }

}
