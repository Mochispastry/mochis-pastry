package cl.siatec.dev.sgisystem.entityservice.repository;

import cl.siatec.dev.sgisystem.entityservice.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Long> {
    Person findByNamesIgnoreCaseAndLastNames(String names, String lastNames);

    List<Person> findByBirthDate(Date birthDate);

    List<Person> findBySex(String sex);

    List<Person> findByNamesContainsAndLastNamesContains(String names, String lastNames);
}