package com.walker.learningaboutspringboot1.repository;

import com.walker.learningaboutspringboot1.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Long> {

}
