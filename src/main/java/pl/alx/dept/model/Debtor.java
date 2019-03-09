package pl.alx.dept.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@Setter
@Getter
@Entity
@NoArgsConstructor
public class Debtor {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 45, unique = true)
    private String email;

    @Column(length = 45, nullable = false)
    private String firstName;

    @Column(length = 45, nullable = false)
    private String lastName;

}

