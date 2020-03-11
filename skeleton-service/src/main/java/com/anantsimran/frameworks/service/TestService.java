package com.anantsimran.frameworks.service;


import com.google.inject.Inject;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TestService {

    public String getTestString(){
        return "Hello";
    }
}
