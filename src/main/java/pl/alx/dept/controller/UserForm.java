package pl.alx.dept.controller;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserForm {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
