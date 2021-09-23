package com.biletdeneme.biletdeneme.api;

import com.biletdeneme.biletdeneme.modal.Bilet;
import com.biletdeneme.biletdeneme.modal.Rezervasyon;
import com.biletdeneme.biletdeneme.service.BiletService;
import com.biletdeneme.biletdeneme.service.RezervasyonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/bilet")
public class RezervasyonApi {

    @Autowired
    private RezervasyonService rezervasyonService;
    public RezervasyonApi(RezervasyonService rezervasyonService) {
        this.rezervasyonService = rezervasyonService;
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<Rezervasyon>> getAll(){
        return ResponseEntity.ok(rezervasyonService.getAll());
    }

    @PostMapping("/save")
    public ResponseEntity<Rezervasyon> save(@Valid @RequestBody Rezervasyon rezervasyon){
        return ResponseEntity.ok(rezervasyonService.save(rezervasyon));
    }
    @PostMapping("/update/{id}")
    public ResponseEntity<Rezervasyon> update(@PathVariable Long id){
        return ResponseEntity.ok(rezervasyonService.update(id));
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Long id){
        return ResponseEntity.ok(rezervasyonService.delete(id));
    }
}

