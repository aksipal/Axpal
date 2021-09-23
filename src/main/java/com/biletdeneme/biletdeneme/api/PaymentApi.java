package com.biletdeneme.biletdeneme.api;
import com.biletdeneme.biletdeneme.modal.Payment;
import com.biletdeneme.biletdeneme.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/bilet")
public class PaymentApi {

    @Autowired
    private final PaymentService paymentService;


    public PaymentApi(PaymentService paymentService) {
        this.paymentService = paymentService;
    }


    @GetMapping("/get-all")
    public ResponseEntity<List<Payment>> getAll(){
        return ResponseEntity.ok(paymentService.getAll());
    }

    @PostMapping("/save")
    public ResponseEntity<Payment> save(@Valid @RequestBody Payment payment){
        return ResponseEntity.ok(paymentService.save(payment));
    }
    @PostMapping("/update/{id}")
    public ResponseEntity<Payment> update(@PathVariable Long id){
        return ResponseEntity.ok(paymentService.update(id));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Long id){
        return ResponseEntity.ok(paymentService.delete(id));
    }


}
