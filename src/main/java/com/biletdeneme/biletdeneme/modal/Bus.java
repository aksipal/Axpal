package com.biletdeneme.biletdeneme.modal;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name="bus")
public class Bus extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="bus_id")
    private Long busId;

    @Column(name="bus_name")
    private String busName;

    @Column(name="bus_koltuk_no")
    private int busKoltukNo;

    @NotNull
    @Column(name="bus_plaka")
    private int busPlaka;

    @NotNull
    @Column(name="bus_start_date")
    private Date busStartDate;

    @Column(name="bus_end_date")
    private Date busEndDate;


}
