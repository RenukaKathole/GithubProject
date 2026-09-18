package com.example.GithubProject.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController {

    @GetMapping
    public String getVersion(){
        return "version 1.0";
    }
}
