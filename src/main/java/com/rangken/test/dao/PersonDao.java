package com.rangken.test.dao;

import com.rangken.test.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public class PersonDao implements IPersonDao {
    @Autowired
    private HibernateTemplate hibernateTemplate;

    public void savePerson() {
        Person person = new Person();
        person.setId(1);
        person.setName("Ram3");
        hibernateTemplate.save(person);
    }
}
