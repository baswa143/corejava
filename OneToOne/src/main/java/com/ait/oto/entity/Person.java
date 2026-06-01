package com.ait.oto.entity;

import javax.persistence.*;

@Entity
@Table(name ="tbl_person")
public class Person {
    @Id
    @Column(name = "person_id")
    private Integer personId;

    @Column(name = "person_name")
    private  String personName;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "passport_id",unique = true, nullable = false)
    private Passport passport;

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", personName='" + personName + '\'' +
                '}';
    }
}
