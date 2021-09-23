package com.biletdeneme.biletdeneme.modal;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name="sehir")
public class Sehir extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="sehir_id")
    private Long sehirId;

    @Column(name="sehir_name")
    private String sehirName;

    @Column(name="sehir_number")
    private int sehirNumber;

    @Column(name="sehir_ozellik")
    private String sehirOzellik;
}
