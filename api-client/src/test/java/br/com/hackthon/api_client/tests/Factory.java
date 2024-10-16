package br.com.hackthon.api_client.tests;

import br.com.hackthon.api_client.dto.*;
import br.com.hackthon.api_client.entities.*;
import br.com.hackthon.api_client.repositories.*;
import org.springframework.beans.factory.annotation.*;

import java.time.*;
import java.util.*;

public class Factory {

    @Autowired
    private static FamilyRepository repository;

    public static Person createdPerson() {

        UUID id = UUID.randomUUID();

        Person entity = new Person(id, "Kaio", "Luiz Felipe", LocalDate.of(1999, 1, 1), 25, "323.244.300-30", 70000.00, LocalDateTime.now());

        return entity;
    }

    public static Family createdFamily() {

        UUID id = UUID.randomUUID();

        Family entity = new Family(id, "Braga Luiz", "SP", "São Paulo", "Soares de Lima", 77, LocalDateTime.now());
        return entity;
    }

    public static PersonDTO createdPersonDtoUpdate() {

        UUID id = UUID.randomUUID();

        PersonDTO dto = new PersonDTO(id, "Kaio", "Luiz Felipe", LocalDate.of(1999, 1, 1), 25, "323.244.300-30", 70000.00, LocalDateTime.now());

        return dto;
    }

    public static PersonDTO createdPersonDtoToInsert() {

        UUID id = UUID.randomUUID();

        PersonDTO dto = new PersonDTO(id, "Luana", "Fernanda Souza", LocalDate.of(1998, 1, 1), 26, "123.244.300-30", 60000.00, LocalDateTime.now());

        return dto;
    }
}

