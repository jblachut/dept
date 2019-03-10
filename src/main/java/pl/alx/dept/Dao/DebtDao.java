package pl.alx.dept.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.alx.dept.model.Debt;
import pl.alx.dept.model.User;

import java.util.List;

public interface DebtDao extends JpaRepository<Debt, Integer> {
    List<Debt>findByLender(User lender);
}
