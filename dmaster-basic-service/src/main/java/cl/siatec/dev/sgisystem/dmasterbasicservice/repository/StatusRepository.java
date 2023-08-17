package cl.siatec.dev.sgisystem.dmasterbasicservice.repository;

import cl.siatec.dev.sgisystem.dmasterbasicservice.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StatusRepository extends JpaRepository<Status, Long> {
    List<Status> findByNameContainsIgnoreCase(String name);

    List<Status> findByTypeStatus_Id(Long id);
}