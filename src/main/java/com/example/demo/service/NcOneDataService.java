package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.apache.http.client.fluent.Request;

import java.io.IOException;

@Service
public class NcOneDataService {

    public String getMasterData() throws IOException {
        return Request.Post("https://services.nconemap.gov/secure/rest/services/NC1Map_Location/MapServer/0/query?where=1%3D1&outFields=*&outSR=4326&f=json")
                .execute()
                .returnContent().asString();

    }
}
