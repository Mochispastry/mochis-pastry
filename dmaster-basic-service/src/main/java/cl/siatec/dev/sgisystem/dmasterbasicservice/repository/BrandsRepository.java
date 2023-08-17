package cl.siatec.dev.sgisystem.dmasterbasicservice.repository;

import cl.siatec.dev.sgisystem.dmasterbasicservice.entity.Brands;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Timestamp;
import java.util.List;

public interface BrandsRepository extends JpaRepository<Brands, Long> {
    List<Brands> findByNameContainsIgnoreCase(String name);
    Brands findByNameIgnoreCase(String name);
    List<Brands> findBySystemImages_CreateAtBetween(Timestamp createAtStart, Timestamp createAtEnd);

    List<Brands> findBySystemImages_UpdateAtBetween(Timestamp updateAtStart, Timestamp updateAtEnd);
}