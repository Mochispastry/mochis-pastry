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
@Table(name = "tax")
public class Tax {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false, unique = true, length = 75)
    private String name;

    @Column(name = "abrev", nullable = false, unique = true, length = 10)
    private String abrev;

    @Column(name = "factor", nullable = false)
    private Double factor;

    @Column(name = "porcent")
    private Short porcent;

    @Column(name = "description")
    private String description;

    @CreationTimestamp
    @Column(name = "create_at_tbl")
    private Timestamp createAt;

    @UpdateTimestamp
    @Column(name = "update_at_tbl")
    private Timestamp updateAt;

}