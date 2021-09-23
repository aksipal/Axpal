package com.biletdeneme.biletdeneme.modal;

import com.sun.istack.NotNull;
import lombok.Data;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name="rezervasyon")
public class Rezervasyon extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="rezervasyon_id")
    private Long rezervasyonId;

    @NotNull
    @Column(name="rezervasyon_date")
    private Date rezervasyonDate;

    @ManyToOne
    @JoinColumn(name="kullanici_id", referencedColumnName = "kullanici_id")
    private Kullanici kullanici;

    @ManyToMany
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<Kullanici> kullaniciBilgileri;

    @OneToMany(mappedBy = "rezervasyon")
    private List<Bilet> biletList ;


}
