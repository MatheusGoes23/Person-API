package com.matheusgoes23.personapi.utils;

import com.matheusgoes23.personapi.dto.request.PersonDTO;
import com.matheusgoes23.personapi.entity.Person;

import java.time.LocalDate;
import java.util.Collections;

public class PersonUtils {

    private static final String FIRSTNAME = "Matheus";
    private static final String LASTNAME = "Goes";
    private static final String CPF = "708.385.870-54";
    private static final long PERSON_ID = 1L;
    private static final LocalDate BIRTH_DATE = LocalDate.of(1985, 11, 12);

    public static PersonDTO createFakeDTO() {
        return PersonDTO.builder()
                .firstName(FIRSTNAME)
                .lastName(LASTNAME)
                .cpf(CPF)
                .birthDate("04-04-2010")
                .phones(Collections.singletonList(PhoneUtils.createFakeDTO()))
                .build();
    }

    public static Person createFakeEntity() {
        return Person.builder()
                .id(PERSON_ID)
                .firstName(FIRSTNAME)
                .lastName(LASTNAME)
                .cpf(CPF)
                .birthDate(BIRTH_DATE)
                .phones(Collections.singletonList(PhoneUtils.createFakeEntity()))
                .build();
    }
}
