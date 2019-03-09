package pl.alx.dept.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.alx.dept.model.Debt;

public interface DebtDao extends JpaRepository<Debt, Integer> {

}
