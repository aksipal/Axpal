package com.biletdeneme.biletdeneme.modal;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name="payment")
public class Payment extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="payment_id")
    private Long paymentId;

    @NotNull
    @Column(name="payment_type")
    private String paymentType;

    @NotNull
    @Column(name="payment_price")
    private Double paymentPrice;

    @NotNull
    @Column(name="payment_card_information")
    private String paymentCardInformation;

    @NotNull
    @Column(name="payment_date")
    private Date paymentDate;

    @ManyToOne
    @JoinColumn(name="kullanici_id", referencedColumnName = "kullanici_id")
    private Kullanici kullanici;

}
