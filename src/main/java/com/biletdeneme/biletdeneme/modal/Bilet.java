package com.biletdeneme.biletdeneme.modal;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;


@Data
@Entity
@Table(name="bilet")
public class Bilet extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="bilet_id")

    private Long biletId;

    @Column(name="bilet_name")
    private String biletName;

    @Column(name="bilet_number")
    private int biletNumber;

    @ManyToOne
    @JoinColumn(name="rezervasyon_id", referencedColumnName = "rezervasyon_id")
    private Rezervasyon rezervasyon;


}
