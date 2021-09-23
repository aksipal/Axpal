package com.biletdeneme.biletdeneme.repository;

import com.biletdeneme.biletdeneme.modal.Bilet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BiletRepository extends JpaRepository<Bilet, Long> {


}
