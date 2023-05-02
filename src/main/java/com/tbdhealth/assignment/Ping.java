package com.tbdhealth.assignment;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "ping")
public class Ping {

    private final Configuration _Config;
    @Autowired
    public Ping(Configuration config){
        _Config = config;
    }

    @GetMapping()
    public String CheckAPI(){
        return "API WORKING ON PORT "+ _Config.getPortNumber();
    }
}
