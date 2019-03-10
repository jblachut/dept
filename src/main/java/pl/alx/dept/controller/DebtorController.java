package pl.alx.dept.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.alx.dept.Dao.DebtDao;
import pl.alx.dept.Dao.DebtorDao;
import pl.alx.dept.model.Debtor;
import pl.alx.dept.model.User;

@Controller
public class DebtorController {
    @Autowired
    private DebtorDao debtorDao;

    @PostMapping("/debtor/create")
    public String createDebtor(@ModelAttribute DebtorForm debtorForm)
    {
        Debtor debtor = new Debtor (
                debtorForm.getFirstName(),
                debtorForm.getLastName(),
                debtorForm.getEmail()
        );

        debtorDao.save(debtor);

        return "redirect:/debts/create";


    }
}
