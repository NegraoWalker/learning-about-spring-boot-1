package com.walker.learningaboutspringboot1.service;

import com.walker.learningaboutspringboot1.data.vo.v1.PersonVO;
import com.walker.learningaboutspringboot1.exception.ResourceNotFoundException;
import com.walker.learningaboutspringboot1.mapper.Mapper;
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

    public PersonVO findById(Long id) {
        logger.info("Finding one person!"); //ENCONTRANDO UMA PESSOA!
        Person person = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!")); //NENHUM REGISTRO ENCONTRADO PARA ESTE ID!
        return Mapper.toPersonVO(person);
    }

    public List<PersonVO> findAll() {
        logger.info("Finding all people!"); //ENCONTRANDO TODAS AS PESSOAS!
        return Mapper.toListPersonVO(repository.findAll());
    }

    public PersonVO create(PersonVO personVO) {
        logger.info("Creating one person!"); //CRIANDO UMA PESSOA!
        Person person = Mapper.toPerson(personVO);
        return Mapper.toPersonVO(repository.save(person));
    }

    // VERSIONAMENTO PARA VERSÃO 2:
//    public PersonVOV2 createV2(PersonVOV2 personVOV2) {
//        logger.info("Creating one person with V2!"); //CRIANDO UMA PESSOA!
//        Person person = Mapper.toPerson(personVOV2);
//        return Mapper.toPersonVOV2(repository.save(person));
//    }

    public PersonVO update(PersonVO personVO) {
        logger.info("Updating one person!"); //ATUALIZANDO UMA PESSOA!
        Person person = repository.findById(personVO.getKey()).orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!")); //NENHUM REGISTRO ENCONTRADO PARA ESTE ID!
        person.setFirstName(personVO.getFirstName());
        person.setLastName(personVO.getLastName());
        person.setAddress(personVO.getAddress());
        person.setGender(personVO.getGender());

        return Mapper.toPersonVO(repository.save(person));
    }

    public void delete(Long id) {
        logger.info("Deleting one person!"); //DELETANDO UMA PESSOA!
        Person person = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!")); //NENHUM REGISTRO ENCONTRADO PARA ESTE ID!
        repository.delete(person);
    }
}
