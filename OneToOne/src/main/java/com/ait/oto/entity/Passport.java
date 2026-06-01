package com.ait.oto.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tbl_passport")
public class Passport {
    @Id
    @Column(name = "passport_id")
    private Integer passportId;


    @Column(name = "expire_date")
    private LocalDate expireDate;

    public Integer getPassportId() {
        return passportId;
    }

    public void setPassportId(Integer passportId) {
        this.passportId = passportId;
    }

    public LocalDate getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(LocalDate expireDate) {
        this.expireDate = expireDate;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "passportId=" + passportId +
                ", expireDate=" + expireDate +
                '}';
    }
}
