package pl.alx.dept.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.alx.dept.model.User;

public interface UserDao extends JpaRepository<User, Integer> {
    User findByEmail(String email);
}
