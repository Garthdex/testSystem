package ru.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.service.holder.UserHolder;

@Controller
public class MainController {

    @Autowired
    UserHolder userHolder;

    @RequestMapping("logout")
    public String logOut() {
        userHolder.setRole(null);
        return "redirect:/";
    }

}
