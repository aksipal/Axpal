package com.biletdeneme.biletdeneme.repository;

import com.biletdeneme.biletdeneme.modal.Bilet;
import com.biletdeneme.biletdeneme.modal.Bus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusRepository extends JpaRepository<Bus, Long> {

}
