package pl.alx.dept.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@Setter
@Getter
@Entity
@NoArgsConstructor
@Table(name = "user")
public class User {
    public enum Role {
        USER, ADMIN
    }
    @Enumerated(EnumType.STRING)
    @Column(length = 45, nullable = false)
    private Role role;

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



    public User(String email, String password, String firstName, String lastName) {
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.role=Role.USER;

    }
}
