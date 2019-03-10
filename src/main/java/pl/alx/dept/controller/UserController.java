package pl.alx.dept.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import pl.alx.dept.Dao.UserDao;
import pl.alx.dept.model.Debtor;
import pl.alx.dept.model.User;

import java.util.List;


@Controller
    public class UserController {
    @Autowired
    private UserDao userDao;

    @GetMapping("/user-list")
    public String userList(Model model) {


            List<User> user = userDao.findAll();
            model.addAttribute("user", user);

            return "user-list";
        }


}

