package pl.alx.dept.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

    @Controller
    public class DebtController {

        @GetMapping("/debts")
        public String debtsPage(){
            return "debt-list";
        }

    }

