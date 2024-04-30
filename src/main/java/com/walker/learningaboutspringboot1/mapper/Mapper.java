package com.walker.learningaboutspringboot1.mapper;

import com.walker.learningaboutspringboot1.data.vo.v1.PersonVO;
import com.walker.learningaboutspringboot1.model.Person;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;

public class Mapper {
    private static PersonVO toPersonVO(Person person) {
        return new ModelMapper().map(person, PersonVO.class);
    }

    private static List<PersonVO> toListPersonVO(List<Person> personList) {
        List<PersonVO> personVOList = new ArrayList<PersonVO>();
        for(Person person : personList) {
            personVOList.add(new ModelMapper().map(personList, PersonVO.class));
        }
        return personVOList;
    }



}
