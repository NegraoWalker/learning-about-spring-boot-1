package com.walker.learningaboutspringboot1.service;

import com.walker.learningaboutspringboot1.exception.ResourceNotFoundException;
import com.walker.learningaboutspringboot1.model.Person;
import com.walker.learningaboutspringboot1.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class PersonService {
    @Autowired
    PersonRepository repository;
    private final Logger logger = Logger.getLogger(PersonService.class.getName());

    public Person findById(Long id) {
        logger.info("Finding one person!");
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!")); //NENHUM REGISTRO ENCONTRADO PARA ESTE ID!
    }

    public List<Person> findAll() {
        logger.info("Finding all people!");
        return repository.findAll();
    }

    public Person create(Person person) {
        logger.info("Creating one person!");
        return repository.save(person);
    }

    public Person update(Person person) {
        logger.info("Updating one person!");
        Person entity = repository.findById(person.getId()).orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!")); //NENHUM REGISTRO ENCONTRADO PARA ESTE ID!
        entity.setFirstName(person.getFirstName());
        entity.setLastName(person.getLastName());
        entity.setAddress(person.getAddress());
        entity.setGender(person.getGender());
        return repository.save(person);
    }

    public void delete(Long id) {
        logger.info("Deleting one person!");
        Person entity = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!")); //NENHUM REGISTRO ENCONTRADO PARA ESTE ID!
        repository.delete(entity);
    }
}
