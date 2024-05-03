package com.walker.learningaboutspringboot1.data.vo.v2;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class PersonVOV2 implements Serializable { //VERSIONAMENTO DE APIS PATTERN VO VERSÃO 2
    private Long id; //IDENTIFICADOR
    private String firstName; //PRIMEIRO NOME
    private String lastName; //SOBRENOME
    private String address; //ENDEREÇO
    private String gender; //GÊNERO
    private Date birthDay; //DATA DE ANIVERSÁRIO

    //CONSTRUCTORS:
    public PersonVOV2() {
    }

    public PersonVOV2(String firstName, String lastName, String address, String gender, Date birthDay) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.gender = gender;
        this.birthDay = birthDay;
    }

    public PersonVOV2(Long id, String firstName, String lastName, String address, String gender, Date birthDay) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.gender = gender;
        this.birthDay = birthDay;
    }

    //GETTERS AND SETTERS:

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    //HASHCODE AND EQUALS:

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonVOV2 that = (PersonVOV2) o;
        return Objects.equals(id, that.id) && Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(address, that.address) && Objects.equals(gender, that.gender) && Objects.equals(birthDay, that.birthDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, address, gender, birthDay);
    }
}
