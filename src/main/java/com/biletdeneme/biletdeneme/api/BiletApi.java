package com.biletdeneme.biletdeneme.api;
import com.biletdeneme.biletdeneme.modal.Bilet;
import com.biletdeneme.biletdeneme.service.BiletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/bilet")
public class BiletApi {

    @Autowired
    private BiletService biletService;
    public BiletApi(BiletService biletService) {this.biletService = biletService;}

    @GetMapping("/get-all")
    public ResponseEntity<List<Bilet>> getAll(){
        return ResponseEntity.ok(biletService.getAll());
    }

    @PostMapping("/save")
    public ResponseEntity<Bilet> save(@Valid @RequestBody Bilet bilet){
        return ResponseEntity.ok(biletService.save(bilet));
    }
    @PostMapping("/update/{id}")
    public ResponseEntity<Bilet> update(@PathVariable Long id){
        return ResponseEntity.ok(biletService.update(id));
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Long id){
        return ResponseEntity.ok(biletService.delete(id));
    }
}
