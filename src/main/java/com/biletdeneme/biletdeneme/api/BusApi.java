package com.biletdeneme.biletdeneme.api;

import com.biletdeneme.biletdeneme.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bilet")
public class BusApi {

    @Autowired
    private BusService busService;


    public BusApi(BusService busService) {
        this.busService = busService;
    }









}
