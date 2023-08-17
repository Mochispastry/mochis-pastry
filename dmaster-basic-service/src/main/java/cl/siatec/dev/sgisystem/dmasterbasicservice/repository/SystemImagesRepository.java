package cl.siatec.dev.sgisystem.dmasterbasicservice.repository;

import cl.siatec.dev.sgisystem.dmasterbasicservice.entity.SystemImages;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Timestamp;
import java.util.List;

public interface SystemImagesRepository extends JpaRepository<SystemImages, Long> {
    SystemImages findByNameIgnoreCase(String name);
    List<SystemImages> findByNameContainsIgnoreCase(String name);

    List<SystemImages> findByFileNameContainsIgnoreCase(String fileName);

    List<SystemImages> findByCreateAtBetween(Timestamp createAtStart, Timestamp createAtEnd);

    List<SystemImages> findByUpdateAtBetween(Timestamp updateAtStart, Timestamp updateAtEnd);
}