package com.qa.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * AUTHOR: Royce Elland Sombrano
 * PROJECT: serinoseven-automation
 * CREATED DATE: April 23, 2021
 * GOD BLESS
 */
public class UrlFactory {

    private Properties prop;

    /**
     * This method is used to get environment
     * @return Properties prop obj
     */
    public String getEnvironment(){
        String environment = System.getProperty("env");
        prop = new Properties();
        String url = null;
        try{
            if(environment.equalsIgnoreCase("QA")){
                FileInputStream envQA = new FileInputStream("./src/test/resources/config/qa.properties");
                prop.load(envQA);
                url = prop.getProperty("url");
            } else if (environment.equalsIgnoreCase("PROD")){
                FileInputStream envPROD = new FileInputStream("./src/test/resources/config/prod.properties");
                prop.load(envPROD);
                url = prop.getProperty("url");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return url;
    }
}
