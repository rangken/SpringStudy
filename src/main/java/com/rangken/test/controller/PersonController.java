package com.rangken.test.controller;


import com.rangken.test.entity.Person;
import com.rangken.test.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {
    @Autowired
    private PersonService personService;

    @RequestMapping(value="/persons", method = RequestMethod.GET)
    public List<Person> list() {
        return personService.getAllPerson();
    }

    @RequestMapping(value="/test", method = RequestMethod.GET)
    public @ResponseBody
    String test() {
        return "test";
    }
}
