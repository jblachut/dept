package pl.alx.dept.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.alx.dept.Dao.DebtorDao;
import pl.alx.dept.Dao.DebtDao;
import pl.alx.dept.model.Debt;
import pl.alx.dept.model.Debtor;
import pl.alx.dept.model.User;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Controller
    public class DebtController {

    @Autowired
    private DebtDao debtDao;

    @Autowired
    private DebtorDao debtorDao;


        @GetMapping("/debts")
        public String debtsPage(Model model)
        {
            List<Debt> debts = debtDao.findAll();
            model.addAttribute("debts", debts);
            return "debt-list";
        }

    @GetMapping("/debts/create")
    public String debtForm(Model model)

    {
        List<Debtor> debtors = debtorDao.findAll();
        model.addAttribute("debtors", debtors);
        return "debt-form";
    }

    @PostMapping("/debts/create")
            public  String saveDebt(@RequestParam Integer debtorId, @RequestParam BigDecimal amount)
        {
            User lender = new User(1); //TODO: DSDSD
            Optional<Debtor> debtor =debtorDao.findById(debtorId);
            Debt debt = new Debt(lender, debtor.get(), amount);
            debtDao.save(debt);
            return "redirect:/debts";
    }



}

