package ru.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ru.model.User;
import ru.service.UserService;
import ru.service.holder.UserHolder;

import java.util.List;

/**
 * Created by Anton on 27.10.2017.
 */
@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserHolder userHolder;

    @RequestMapping(value = "login")
    public String initData(){

        return "page/login";
    }

    @RequestMapping(value = "login/in")
    public String signIn(@RequestParam String login, @RequestParam String password, Model model) {

        return "page/main";
    }
}
