package com.tbdhealth.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class Configuration {

    @Autowired
    private Environment env;

    public String getPortNumber(){
        return env.getProperty("server.port");
    }
}
