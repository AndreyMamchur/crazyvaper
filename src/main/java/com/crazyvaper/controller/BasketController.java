package com.crazyvaper.controller;

import com.crazyvaper.entity.Basket;
import com.crazyvaper.service.interfaces.BasketServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Controller
@RequestMapping("/")
public class BasketController {

    @Autowired
    private BasketServise basketServise;

    @GetMapping("/basket/{id}")
    public String getBasket(@PathVariable("id") long id, Model model){
        Basket basketById = basketServise.getById(id);
        model.addAttribute("basket", basketById);
        return "showBasket";
    }

    @GetMapping("/basketList")
    public String getAllBasket(Model model){
        model.addAttribute("basketList", basketServise.getAll());
        return "basketList";
    }

}
