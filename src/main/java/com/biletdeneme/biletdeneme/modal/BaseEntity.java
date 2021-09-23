package com.biletdeneme.biletdeneme.modal;
import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;
import lombok.Data;

@Data
@MappedSuperclass
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Version
    private Long version;

    @Temporal(TemporalType.TIMESTAMP)
    private Calendar olusmaTarihi;

    @Temporal(TemporalType.TIMESTAMP)
    private Calendar guncellenmeTarihi;

}
