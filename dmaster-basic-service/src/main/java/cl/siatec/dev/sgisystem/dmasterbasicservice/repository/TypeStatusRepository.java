package cl.siatec.dev.sgisystem.dmasterbasicservice.repository;

import cl.siatec.dev.sgisystem.dmasterbasicservice.entity.TypeStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Timestamp;
import java.util.List;

public interface TypeStatusRepository extends JpaRepository<TypeStatus, Long> {
    List<TypeStatus> findByNameContainsIgnoreCase(String name);
    List<TypeStatus> findByCreateAtBetween(Timestamp createAtStart, Timestamp createAtEnd);

}