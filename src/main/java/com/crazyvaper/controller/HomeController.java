package com.crazyvaper.controller;

import com.crazyvaper.service.interfaces.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    private GoodsService goodsService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("goodsList", goodsService.getAll());
        return "index";
    }
}
