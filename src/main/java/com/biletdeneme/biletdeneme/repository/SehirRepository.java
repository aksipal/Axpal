package com.biletdeneme.biletdeneme.repository;

import com.biletdeneme.biletdeneme.modal.Kullanici;
import com.biletdeneme.biletdeneme.modal.Sehir;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SehirRepository extends JpaRepository<Sehir, Long> {

}
