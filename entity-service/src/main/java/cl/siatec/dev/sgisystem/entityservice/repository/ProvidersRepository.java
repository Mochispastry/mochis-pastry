package cl.siatec.dev.sgisystem.entityservice.repository;

import cl.siatec.dev.sgisystem.entityservice.entity.Providers;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface ProvidersRepository extends JpaRepository<Providers, Long> {
    List<Providers> findByFirstTransactionDate(Date firstTransactionDate);

    List<Providers> findByLastTransactionDate(Date lastTransactionDate);
}