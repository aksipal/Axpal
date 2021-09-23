package com.biletdeneme.biletdeneme.service;

import com.biletdeneme.biletdeneme.modal.Kullanici;
import com.biletdeneme.biletdeneme.repository.KullaniciRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Slf4j
@Service
@Transactional
public class KullaniciService {

    @Autowired
    private KullaniciRepository kullaniciRepository;

    public KullaniciService(KullaniciRepository kullaniciRepository) {
        this.kullaniciRepository = kullaniciRepository;
    }


    public List<Kullanici> getAll() {
    return kullaniciRepository.findAll();

    }

}
