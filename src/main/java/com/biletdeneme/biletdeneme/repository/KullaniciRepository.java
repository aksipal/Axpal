package com.biletdeneme.biletdeneme.repository;

import com.biletdeneme.biletdeneme.modal.Bilet;
import com.biletdeneme.biletdeneme.modal.Kullanici;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KullaniciRepository extends JpaRepository<Kullanici, Long> {

}
