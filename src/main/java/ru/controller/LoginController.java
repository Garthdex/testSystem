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
    private static final String ERROR_MESSAGE_LOGIN = "This user was not found";
    private static final String ERROR_MESSAGE_PASSWORD = "Password is incorrect";
    private static final String ERROR_MASSAGE_USER_EXIST = "This login is already used. Please try again";
    private static final String SUCCESS_REGISTRATION = "You has registered! Please sign in";

    @Autowired
    private UserService userService;

    @Autowired
    private UserHolder userHolder;

    @RequestMapping(value = "/")
    public String initData(){

        return "page/login";
    }

    @RequestMapping(value = "login/signIn")
    public String signIn(@RequestParam String login, @RequestParam String password, Model model) {
        User user = userService.getUserByLogin(login);
        if (user == null) {
            model.addAttribute("errorMessageLogin", ERROR_MESSAGE_LOGIN);
            return "page/login";
        }
        if (!user.getPassword().equals(password)) {
            model.addAttribute("errorMessagePassword", ERROR_MESSAGE_PASSWORD);
            return "page/login";
        }

        userHolder.setRole(user.getRole());
        return "page/main";
    }

    @RequestMapping(value = "login/signUp")
    public String signUp(@RequestParam String registerLogin, @RequestParam String registerPassword, @RequestParam String registerRole, Model model) {
        if(userService.getUserByLogin(registerLogin) != null) {
            model.addAttribute("errorMessageRegistration", ERROR_MASSAGE_USER_EXIST);
            return "page/login";
        }

        User user = new User(registerLogin, registerPassword, registerRole);
        userService.addUser(user);

        model.addAttribute("successMessage", SUCCESS_REGISTRATION);
        return "page/login";
    }
}
