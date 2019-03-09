package pl.alx.dept.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.alx.dept.Dao.DeptDao;
import pl.alx.dept.model.Debt;

import java.util.ArrayList;
import java.util.List;

@Controller
    public class DebtController {

    @Autowired
    private DeptDao deptDao;


        @GetMapping("/debts")
        public String debtsPage(Model model)
        {
            List<Debt> debts = deptDao.findAll();
            model.addAttribute("debts", debts);
            return "debt-list";
        }

    }

