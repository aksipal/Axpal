package com.biletdeneme.biletdeneme.service;
import com.biletdeneme.biletdeneme.modal.Sehir;
import com.biletdeneme.biletdeneme.repository.SehirRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Slf4j
@Service
@Transactional
public class SehirService {

    @Autowired

    private final SehirRepository sehirRepository;

    public SehirService(SehirRepository sehirRepository){this.sehirRepository = sehirRepository;}

    public List<Sehir> getAll() {
        return sehirRepository.findAll();
    }

    public Sehir save(Sehir sehir) {
        return sehirRepository.save(sehir);
    }

    public Sehir update(Long sehirId) {

        return sehirRepository.save(  sehirRepository.findById(sehirId).get());
    }

    public Boolean delete(Long id) {
        sehirRepository.deleteById(id);
        return true;
    }
}

