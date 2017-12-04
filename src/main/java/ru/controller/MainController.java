package ru.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import ru.service.TestService;
import ru.service.holder.UserHolder;

@Controller
public class MainController {
    private static final String ROLE = "role";
    private static final String LOGIN = "login";
    private static final String TEST_LIST = "testList";

    @Autowired
    UserHolder userHolder;

    @Autowired
    private TestService testService;

    @RequestMapping("main")
    public String initData(Model model) {

        model.addAttribute(LOGIN, userHolder.getLogin());
        model.addAttribute(ROLE, userHolder.getRole());
        model.addAttribute(TEST_LIST, testService.getTestList());
        return "page/main";
    }

    @RequestMapping("logout")
    public String logOut() {
        userHolder.setRole(null);
        return "redirect:/";
    }

}
