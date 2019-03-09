package pl.alx.dept.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.alx.dept.model.Debtor;

public interface DebtorDao extends JpaRepository <Debtor, Integer>{
}
