package cl.siatec.dev.sgisystem.entityservice.repository;

import cl.siatec.dev.sgisystem.entityservice.entity.Entities;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EntitiesRepository extends JpaRepository<Entities, Long> {
    Entities findByRutIgnoreCase(String rut);

    List<Entities> findByTypeEntityIgnoreCase(String typeEntity);

    List<Entities> findByMail(String mail);

    List<Entities> findByPhone(String phone);



}