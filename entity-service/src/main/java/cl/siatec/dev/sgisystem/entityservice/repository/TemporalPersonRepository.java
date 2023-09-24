package cl.siatec.dev.sgisystem.entityservice.repository;

import cl.siatec.dev.sgisystem.entityservice.entity.TemporalPerson;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TemporalPersonRepository extends JpaRepository<TemporalPerson, Long> {
    TemporalPerson findByNamesAndLastNamesAndMail(String names, String lastNames, String mail);

    List<TemporalPerson> findByRazonContactIgnoreCase(String razonContact);


}