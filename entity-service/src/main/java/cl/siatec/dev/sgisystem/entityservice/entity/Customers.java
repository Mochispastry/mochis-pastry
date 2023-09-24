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
@Table(name = "customer")
public class Customers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "entities_id")
    private Entities entities;

    @Temporal(TemporalType.DATE)
    @Column(name = "first_transaction_date")
    private Date firstTransactionDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "last_transaction_date")
    private Date lastTransactionDate;

    @CreationTimestamp
    @Column(name = "create_at_tbl")
    private Timestamp createAt;

    @UpdateTimestamp
    @Column(name = "update_at_tbl")
    private Timestamp updateAt;

}