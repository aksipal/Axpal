package com.biletdeneme.biletdeneme.service;

import com.biletdeneme.biletdeneme.modal.Bilet;
import com.biletdeneme.biletdeneme.modal.Rezervasyon;
import com.biletdeneme.biletdeneme.modal.Sehir;
import com.biletdeneme.biletdeneme.repository.BiletRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@Transactional
public class BiletService {

    @Autowired
    private BiletRepository biletRepository;

    public BiletService(BiletRepository biletRepository) { this.biletRepository = biletRepository; }

    public List<Bilet> getAll() {
        return biletRepository.findAll();
    }

    public Bilet save(Bilet bilet) {
        return biletRepository.save(bilet);
    }

    public Bilet update(Long biletId) {
        return biletRepository.save(  biletRepository.findById(biletId).get());
    }
    public Boolean delete(Long id) {
        biletRepository.deleteById(id);
        return true;
    }
}
