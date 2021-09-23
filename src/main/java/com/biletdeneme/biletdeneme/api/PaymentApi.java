package com.biletdeneme.biletdeneme.api;

import com.biletdeneme.biletdeneme.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bilet")
public class PaymentApi {

    @Autowired
    private PaymentService paymentService;


    public PaymentApi(PaymentService paymentService) {
        this.paymentService = paymentService;
    }












}
