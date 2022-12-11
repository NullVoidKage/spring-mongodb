package com.example.demo.service;

import com.example.demo.collection.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.swing.text.Document;
import java.util.List;


public interface PersonService {
    String save(Person person);

    List<Person> getPersonStartWith(String name);

    void delete(String id);

    List<Person> getByPersonAge(Integer minAge, Integer maxAge);

    Page<Person> search(String name, Integer minAge, Integer maxAge, String city, Pageable pageable);

    List<Document> getOldestPersonByCity();

    List<Document> getPopulationByCity();
}

