package com.walker.learningaboutspringboot1.service;

import com.walker.learningaboutspringboot1.data.vo.v1.PersonVO;
import com.walker.learningaboutspringboot1.exception.ResourceNotFoundException;
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

    public PersonVO findById(Long id) {
        logger.info("Finding one person!"); //ENCONTRANDO UMA PESSOA!
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!")); //NENHUM REGISTRO ENCONTRADO PARA ESTE ID!
    }

    public List<PersonVO> findAll() {
        logger.info("Finding all people!"); //ENCONTRANDO TODAS AS PESSOAS!
        return repository.findAll();
    }

    public PersonVO create(PersonVO person) {
        logger.info("Creating one person!"); //CRIANDO UMA PESSOA!
        return repository.save(person);
    }

    public PersonVO update(PersonVO person) {
        logger.info("Updating one person!"); //ATUALIZANDO UMA PESSOA!
        PersonVO entity = repository.findById(person.getId()).orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!")); //NENHUM REGISTRO ENCONTRADO PARA ESTE ID!
        entity.setFirstName(person.getFirstName());
        entity.setLastName(person.getLastName());
        entity.setAddress(person.getAddress());
        entity.setGender(person.getGender());
        return repository.save(person);
    }

    public void delete(Long id) {
        logger.info("Deleting one person!"); //DELETANDO UMA PESSOA!
        PersonVO entity = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!")); //NENHUM REGISTRO ENCONTRADO PARA ESTE ID!
        repository.delete(entity);
    }
}
