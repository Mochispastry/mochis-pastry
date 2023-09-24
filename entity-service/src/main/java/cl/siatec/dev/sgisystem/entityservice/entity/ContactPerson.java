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
@Table(name = "contact_person")
public class ContactPerson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "entities_id", nullable = false)
    private Entities entities;

    @ManyToOne(optional = false)
    @JoinColumn(name = "entity_parent_id", nullable = false)
    private Entities entityParent;

    @Column(name = "relationship", nullable = false, length = 100)
    private String relationship;

    @CreationTimestamp
    @Column(name = "create_at_tbl")
    private Timestamp createAt;

    @UpdateTimestamp
    @Column(name = "update_at_tbl")
    private Timestamp updateAt;

}