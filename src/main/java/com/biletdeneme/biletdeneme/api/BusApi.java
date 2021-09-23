package com.biletdeneme.biletdeneme.api;

import com.biletdeneme.biletdeneme.modal.Bus;
import com.biletdeneme.biletdeneme.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/bilet")
public class BusApi {

    @Autowired
    private final BusService busService;

    public BusApi(BusService busService){this.busService = busService;}

    @GetMapping("/get-all")
    public ResponseEntity<List<Bus>> getAll(){
        return ResponseEntity.ok(busService.getAll());
    }

    @PostMapping("/save")
    public ResponseEntity<Bus> save(@Valid @RequestBody Bus bus){
        return ResponseEntity.ok(busService.save(bus));
    }
    @PostMapping("/update/{id}")
    public ResponseEntity<Bus> update(@PathVariable Long id){
        return ResponseEntity.ok(busService.update(id));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Long id){
        return ResponseEntity.ok(busService.delete(id));
    }
}


