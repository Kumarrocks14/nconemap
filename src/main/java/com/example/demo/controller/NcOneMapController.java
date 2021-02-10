package com.example.demo.controller;

import com.example.demo.cache.ZipcodeToCounty;
import com.example.demo.service.NcOneDataService;
import org.apache.http.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.HashMap;

@RestController
@RequestMapping(path = "/nconemap")
public class NcOneMapController {

    @Autowired
    ZipcodeToCounty zipcodeToCounty;

    @Autowired
    NcOneDataService ncOneDataService;

    @GetMapping(path="/getCityToZipcode")
    public HashMap<String, String> getMessage()
    {
        return zipcodeToCounty.zipToCountyMap;
    }

    //ABout to write coding to fetch data from https://services.nconemap.gov/secure/rest/services/NC1Map_Location/MapServer/0/query?where=1%3D1&outFields=*&outSR=4326&f=json
    @GetMapping(path="/masterdataset")
    public String getMasterDataSet() throws IOException {
        return ncOneDataService.getMasterData();
    }
}
