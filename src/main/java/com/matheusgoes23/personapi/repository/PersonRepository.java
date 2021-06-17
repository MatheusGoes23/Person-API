package com.matheusgoes23.personapi.repository;

import com.matheusgoes23.personapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
