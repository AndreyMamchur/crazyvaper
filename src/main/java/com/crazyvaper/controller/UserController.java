package com.crazyvaper.controller;

import com.crazyvaper.entity.RoleEnum;
import com.crazyvaper.entity.User;
import com.crazyvaper.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/{id}")
    public String getUserById(@PathVariable("id") long id, Model model) {
        model.addAttribute("user", userService.getById(id));
        return "showUser";
    }

    @GetMapping("/users")
    public String getAllUsers(Model model) {
        model.addAttribute("users", userService.getAll());
        return "userList";
    }

    @PostMapping("/newUser")
    public String createUser(@ModelAttribute User user) {
        userService.save(validateUser(user));
        return "redirect:users";
    }

    @GetMapping("/edit/{id}")
    public String editPage(@PathVariable("id") long id, Model model) {
        System.out.println("id = " + id);
        model.addAttribute("user", userService.getById(id));
        return "editUser";
    }

    @PostMapping("/editUser")
    public String editUser(@ModelAttribute User user, Model model) {
        userService.update(user);
        return "redirect:edit/" + user.getId();
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") long id) {
        userService.delete(id);
        return "redirect:/users";
    }

    @PostMapping("/delete")
    public String deleteUser2(@ModelAttribute("id") long id) {
        userService.delete(id);
        return "redirect:users";
    }

    @GetMapping("/loginAndRegistration")
    public String loginAndRegistration(){
        return "loginAndRegistration";
    }

    @PostMapping("/registrationUser")
    public String registrationUser(@ModelAttribute User user) {
        userService.save(validateUser(user));
        return "redirect:index";
    }

    public User validateUser(User user){
        if (user.getDateOfBirth() == null) {
            user.setDateOfBirth("");
        }

        if (user.getPhoneNumber() == null){
            user.setPhoneNumber("");
        }
        return user;
    }


}

