package cl.siatec.dev.sgisystem.entityservice.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "employees")
public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "entities_id", nullable = false)
    private Entities entities;

    @Temporal(TemporalType.DATE)
    @Column(name = "init_contract_date")
    private Date initContractDate;

    @Column(name = "type_contract", nullable = false, length = 50)
    private String typeContract;

    @Temporal(TemporalType.DATE)
    @Column(name = "end_contract")
    private Date endContract;

    @CreationTimestamp
    @Column(name = "create_at_tbl")
    private Timestamp createAt;

    @UpdateTimestamp
    @Column(name = "update_at_tbl")
    private Timestamp updateAt;



}