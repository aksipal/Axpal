package com.biletdeneme.biletdeneme.api;


import com.biletdeneme.biletdeneme.modal.Sehir;
import com.biletdeneme.biletdeneme.service.SehirService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/bilet")
public class SehirApi {

    @Autowired
    private SehirService sehirService;
    public SehirApi(SehirService sehirService){this.sehirService = sehirService;}

    @GetMapping("/get-all")
    public ResponseEntity<List<Sehir>> getAll(){
        return ResponseEntity.ok(sehirService.getAll());
    }

    @PostMapping("/save")
    public ResponseEntity<Sehir> save(@Valid @RequestBody Sehir sehir){
        return ResponseEntity.ok(sehirService.save(sehir));
    }
    @PostMapping("/update/{id}")
    public ResponseEntity<Sehir> update(@PathVariable Long id){
        return ResponseEntity.ok(sehirService.update(id));
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Long id){
        return ResponseEntity.ok(sehirService.delete(id));
    }
}


