package com.biletdeneme.biletdeneme.api;

import com.biletdeneme.biletdeneme.service.KullaniciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bilet")
public class KullaniciApi {

    @Autowired
    private KullaniciService kullaniciService;


    public KullaniciApi(KullaniciService kullaniciService) {
        this.kullaniciService = kullaniciService;
    }







}
