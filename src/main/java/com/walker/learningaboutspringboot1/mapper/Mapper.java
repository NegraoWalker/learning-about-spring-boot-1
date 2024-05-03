package com.walker.learningaboutspringboot1.mapper;

import com.walker.learningaboutspringboot1.data.vo.v1.PersonVO;
import com.walker.learningaboutspringboot1.model.Person;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;

public class Mapper {
    private static ModelMapper modelMapper = new ModelMapper();

    public static PersonVO toPersonVO(Person person) {
        return modelMapper.map(person, PersonVO.class);
    }

    public static Person toPerson(PersonVO personVO) {
        return modelMapper.map(personVO, Person.class);
    }

    public static List<PersonVO> toListPersonVO(List<Person> personList) {
        List<PersonVO> personVOList = new ArrayList<>();
        for(Person person : personList) {
            personVOList.add(toPersonVO(person));
        }
        return personVOList;
    }
}
