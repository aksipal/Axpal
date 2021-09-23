package com.biletdeneme.biletdeneme.modal;

import com.sun.istack.NotNull;
import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name="kullanici")
public class Kullanici extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="kullanici_id")
    private Long kullaniciId;

    @Column(name="kullanici_name")
    private String kullaniciName;

    @Column(name="kullanici_surname")
    private String kullaniciSurname;

    @NotNull
    @Column(name="kullanici_tc")
    private int kullaniciTc;

    @Column(name="kullanici_telefon")
    private int kullaniciTel;

    @Column(name="kullanici_adres")
    private String kullaniciAdres;

    @Column(name="kullanici_login_name")
    private String kullaniciLoginName;

    @Column(name="kullanici_login_pasword")
    private String kullaniciLoginPasword;

    @OneToMany(mappedBy = "kullanici")
    private List<Payment> paymentList ;

    @OneToMany(mappedBy = "kullanici")
    private List<Rezervasyon> rezervasyonList ;

    @ManyToMany(mappedBy = "kullaniciBilgileri")
    private List<Rezervasyon> rezervasyonBilgileri;

}
