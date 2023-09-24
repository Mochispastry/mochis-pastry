package cl.siatec.dev.sgisystem.entityservice.repository;

import cl.siatec.dev.sgisystem.entityservice.entity.Customers;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface CustomersRepository extends JpaRepository<Customers, Long> {
    List<Customers> findByFirstTransactionDate(Date firstTransactionDate);

    List<Customers> findByLastTransactionDate(Date lastTransactionDate);
}