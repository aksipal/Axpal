package com.biletdeneme.biletdeneme.service;


import com.biletdeneme.biletdeneme.modal.Rezervasyon;
import com.biletdeneme.biletdeneme.repository.RezervasyonRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.List;

@Slf4j
@Service
@Transactional
public class RezervasyonService {

    @Autowired
    private final RezervasyonRepository rezervasyonRepository;
    public RezervasyonService(RezervasyonRepository rezervasyonRepository){this.rezervasyonRepository = rezervasyonRepository;}

    public List<Rezervasyon> getAll() {
        return rezervasyonRepository.findAll();
    }

    public Rezervasyon save(Rezervasyon rezervasyon) {
        return rezervasyonRepository.save(rezervasyon);
    }

    public Rezervasyon update(Long rezervasyonId) {

        return rezervasyonRepository.save(  rezervasyonRepository.findById(rezervasyonId).get());
    }

    public Boolean delete(Long id) {
        rezervasyonRepository.deleteById(id);
        return true;
    }
}
