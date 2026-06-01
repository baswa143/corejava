package com.ait.oto.client;

import com.ait.oto.dao.PersonDAO;
import com.ait.oto.dao.impl.PersonDAOImpl;
import com.ait.oto.entity.Passport;
import com.ait.oto.entity.Person;


import java.time.LocalDate;


public class Tester {
    public static void main(String[] args) {
        PersonDAO dao=new PersonDAOImpl();

        Person p=new Person();
        p.setPersonId(0132);
        p.setPersonName("Baswaraj");

        Passport pp=new Passport();
        pp.setPassportId(8411);
        pp.setExpireDate(LocalDate.of(2080, 12,24));
        p.setPassport(pp);

        dao.savePerson(p);
    }
}
