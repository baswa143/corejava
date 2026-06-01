package com.ait.oto.dao;

import com.ait.oto.entity.Person;

public interface PersonDAO {
    void savePerson(Person person);
    Person fetchPersonById(Integer personId);
    void removePerson(Integer personId);
}
