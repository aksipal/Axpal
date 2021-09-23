package com.biletdeneme.biletdeneme.repository;

import com.biletdeneme.biletdeneme.modal.Bus;
import com.biletdeneme.biletdeneme.modal.Rezervasyon;
import com.biletdeneme.biletdeneme.service.RezervasyonService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RezervasyonRepository extends JpaRepository<Rezervasyon, Long> {

}
