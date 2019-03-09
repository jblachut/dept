package pl.alx.dept.model;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;


}
