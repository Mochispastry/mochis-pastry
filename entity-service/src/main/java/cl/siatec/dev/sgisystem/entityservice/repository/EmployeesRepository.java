package cl.siatec.dev.sgisystem.entityservice.repository;

import cl.siatec.dev.sgisystem.entityservice.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface EmployeesRepository extends JpaRepository<Employees, Long> {
    List<Employees> findByInitContractDate(Date initContractDate);

    List<Employees> findByTypeContract(String typeContract);

    List<Employees> findByEndContract(Date endContract);
}