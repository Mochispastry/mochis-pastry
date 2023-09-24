package cl.siatec.dev.sgisystem.entityservice.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name = "temporal_person")
public class TemporalPerson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "names", nullable = false, length = 150)
    private String names;

    @Column(name = "last_names", nullable = false, length = 150)
    private String lastNames;

    @Column(name = "mail", nullable = false, length = 150)
    private String mail;

    @Column(name = "razon_contact", nullable = false, length = 100)
    private String razonContact;

    @CreationTimestamp
    @Column(name = "create_at_tbl")
    private Timestamp createAt;

    @UpdateTimestamp
    @Column(name = "update_at_tbl")
    private Timestamp updateAt;

}