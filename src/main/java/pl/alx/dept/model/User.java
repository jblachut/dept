package pl.alx.dept.model;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {
@Id

@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;

@Column(length = 45, unique = true, nullable = false)
private String email;


private String password;


@Column(length = 45, nullable = false)
private String firstName;

@Column(length = 45, nullable = false)
private String lastName;

}
