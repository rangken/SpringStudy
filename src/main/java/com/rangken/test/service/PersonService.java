package com.rangken.test.service;

import com.rangken.test.entity.Person;
import com.rangken.test.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public List<Person> getAllPerson()
    {
        return this.personRepository.getAllPerson();
    }
}
