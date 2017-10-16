package com.crazyvaper.controller;

import com.crazyvaper.entity.Cart;
import com.crazyvaper.service.interfaces.CartServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class CartController {

    @Autowired
    private CartServise cartServise;

    @GetMapping("/cart/{id}")
    public String getBasket(@PathVariable("id") long id, Model model){
        Cart cartById = cartServise.getById(id);
        model.addAttribute("cart", cartById);
        return "showCart";
    }

    @GetMapping("/cartList")
    public String getAllBasket(Model model){
        model.addAttribute("cartList", cartServise.getAll());
        return "cartList";
    }

}
