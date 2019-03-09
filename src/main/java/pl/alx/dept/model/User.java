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

    public User(int id) {
        this.id=id;

    }
}
