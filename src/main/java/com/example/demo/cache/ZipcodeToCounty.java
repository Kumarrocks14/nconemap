package com.example.demo.cache;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;

@Component
public class ZipcodeToCounty {
    public HashMap<String,String> zipToCountyMap= new HashMap();

    @PostConstruct
    public void loadZipToCity()
    {
        zipToCountyMap.put("72712","Benton County");
        zipToCountyMap.put("75001","DallasCounty");
    }
}
