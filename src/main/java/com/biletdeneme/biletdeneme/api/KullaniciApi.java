package com.biletdeneme.biletdeneme.api;

import com.biletdeneme.biletdeneme.modal.Kullanici;
import com.biletdeneme.biletdeneme.modal.Sehir;
import com.biletdeneme.biletdeneme.service.KullaniciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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

    @PostMapping("/save")
    public ResponseEntity<Kullanici> save(@Valid @RequestBody Kullanici kullanici){
        return ResponseEntity.ok(kullaniciService.save(kullanici));
    }
    @PostMapping("/update/{id}")
    public ResponseEntity<Kullanici> update(@PathVariable Long id){
        return ResponseEntity.ok(kullaniciService.update(id));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Long id){
        return ResponseEntity.ok(kullaniciService.delete(id));
    }
}

