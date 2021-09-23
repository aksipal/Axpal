package com.biletdeneme.biletdeneme.api;

import com.biletdeneme.biletdeneme.modal.Kullanici;
import com.biletdeneme.biletdeneme.modal.Sehir;
import com.biletdeneme.biletdeneme.service.KullaniciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bilet")
public class KullaniciApi {

    @Autowired
    private KullaniciService kullaniciService;

    public KullaniciApi(KullaniciService kullaniciService) {
        this.kullaniciService = kullaniciService;
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<Kullanici>> getAll(){
        return ResponseEntity.ok(kullaniciService.getAll());
    }



}
