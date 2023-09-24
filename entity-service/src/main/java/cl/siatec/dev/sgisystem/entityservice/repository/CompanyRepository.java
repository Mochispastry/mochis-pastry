package cl.siatec.dev.sgisystem.entityservice.repository;

import cl.siatec.dev.sgisystem.entityservice.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CompanyRepository extends JpaRepository<Company, Long> {
    Company findBySocialRazonIgnoreCase(String socialRazon);

    Company findByFantasyName(String fantasyName);

    List<Company> findBySocialRazonContainsIgnoreCaseAndFantasyNameContainsIgnoreCase(String socialRazon, String fantasyName);
}