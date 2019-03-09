package pl.alx.dept.model;

import javax.persistence.*;

@Entity
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

