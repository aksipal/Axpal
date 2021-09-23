package com.biletdeneme.biletdeneme.service;

import com.biletdeneme.biletdeneme.modal.Bus;
import com.biletdeneme.biletdeneme.repository.BusRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Slf4j
@Service
@Transactional
public class BusService {

    @Autowired
    private final BusRepository busRepository;
    public BusService(BusRepository busRepository){this.busRepository = busRepository;}

    public List<Bus> getAll() {
        return busRepository.findAll();
    }

    public Bus save(Bus bus)
    {
        return busRepository.save(bus);
    }

    public Bus update(Long busId) {
        return busRepository.save(  busRepository.findById(busId).get());
    }

    public Boolean delete(Long id) {
        busRepository.deleteById(id);
        return true;
    }















}
