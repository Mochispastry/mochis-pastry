package cl.siatec.dev.sgisystem.dmasterbasicservice.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Table(name = "status")
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tbl_key", nullable = false)
    private Long id;

    @Column(name = "sts_tbl0001_cmp_0", nullable = false, unique = true, length = 50)
    private String name;

    @ManyToOne(optional = false)
    @JoinColumn(name = "sts_tbl0001_cmp_1", nullable = false)
    private TypeStatus typeStatus;

    @Column(name = "sts_tbl0001_cmp_2")
    private String description;

    @CreationTimestamp
    @Column(name = "create_at_tbl")
    private Timestamp createAt;

    @UpdateTimestamp
    @Column(name = "update_at_tbl")
    private Timestamp updateAt;

}