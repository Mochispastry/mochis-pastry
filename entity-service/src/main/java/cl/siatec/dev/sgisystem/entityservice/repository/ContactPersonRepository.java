package cl.siatec.dev.sgisystem.entityservice.repository;

import cl.siatec.dev.sgisystem.entityservice.entity.ContactPerson;
import cl.siatec.dev.sgisystem.entityservice.entity.Entities;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContactPersonRepository extends JpaRepository<ContactPerson, Long> {
    List<ContactPerson> findByEntityParent(Entities entityParent);
}