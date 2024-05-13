package com.walker.learningaboutspringboot1.data.vo.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.springframework.hateoas.RepresentationModel;
import java.io.Serializable;
import java.util.Objects;

@JsonPropertyOrder({"id", "firstName", "lastName", "address", "gender"}) //DEFINE A ORDEM DE RESPOSTA DOS PARÂMETROS
public class PersonVO extends RepresentationModel<PersonVO> implements Serializable {
    @JsonProperty("id") //INDICA QUE O PARÂMETRO KEY DEVE RETORNAR COMO ID
    private Long key; //IDENTIFICADOR
    private String firstName; //PRIMEIRO NOME
    private String lastName; //SOBRENOME
    private String address; //ENDEREÇO
    private String gender; //GÊNERO

    //CONSTRUCTORS:
    public PersonVO() {
    }


    //GETTERS AND SETTERS:
    public Long getKey() {
        return key;
    }

    public void setKey(Long key) {
        this.key = key;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    //HASHCODE AND EQUALS:
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PersonVO personVO = (PersonVO) o;
        return Objects.equals(key, personVO.key) && Objects.equals(firstName, personVO.firstName) && Objects.equals(lastName, personVO.lastName) && Objects.equals(address, personVO.address) && Objects.equals(gender, personVO.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), key, firstName, lastName, address, gender);
    }
}
