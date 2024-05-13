package com.walker.learningaboutspringboot1.mapper;

import com.walker.learningaboutspringboot1.data.vo.v1.PersonVO;
import com.walker.learningaboutspringboot1.data.vo.v2.PersonVOV2;
import com.walker.learningaboutspringboot1.model.Person;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;

public class Mapper {
    private static ModelMapper modelMapper = new ModelMapper();

    //ModelMapper encontra um objeto do tipo Person, ele irá copiar o valor do campo id desse objeto para o campo key do objeto PersonVO e vice-versa:
    static {
        modelMapper.createTypeMap(Person.class, PersonVO.class).addMapping(Person::getId, PersonVO::setKey);
        modelMapper.createTypeMap(PersonVO.class, Person.class).addMapping(PersonVO::getKey, Person::setId);
    }

    public static PersonVO toPersonVO(Person person) { //CONVERTE DE PERSON PARA PERSONVO
        return modelMapper.map(person, PersonVO.class);
    }
    //VERSIONAMENTO PARA A VERSÃO 2:
//    public static PersonVOV2 toPersonVOV2(Person person) { //CONVERTE DE PERSON PARA PERSONVOV2
//        return modelMapper.map(person, PersonVOV2.class);
//    }

    public static Person toPerson(PersonVO personVO) { //CONVERTE DE PERSONVO PARA PERSON
        return modelMapper.map(personVO, Person.class);
    }

    //VERSIONAMENTO PARA A VERSÃO 2:
//    public static Person toPerson(PersonVOV2 personVOV2) { //CONVERTE DE PERSON PARA PERSONVOV2
//        return modelMapper.map(personVOV2, Person.class);
//    }

    public static List<PersonVO> toListPersonVO(List<Person> personList) { //CONVERTE DE PERSON PARA PERSONVO
        List<PersonVO> personVOList = new ArrayList<>();
        for(Person person : personList) {
            personVOList.add(toPersonVO(person));
        }
        return personVOList;
    }
}
