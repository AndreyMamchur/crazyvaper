package com.crazyvaper.controller;


import com.crazyvaper.entity.Goods;
import com.crazyvaper.service.interfaces.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @GetMapping("/goods/{id}")
    public String getGoods(@PathVariable("id") int id, Model model){
        Goods goodsById = goodsService.getById(id);
        model.addAttribute("goods", goodsById);
        return "showGoods";
    }

    @GetMapping("/goodsList")
    public String showAllGoods(Model model){
        model.addAttribute("goodsList", goodsService.getAll());
        return "goodsList";
    }

    @GetMapping("/goods")
    public String addGoods(@RequestParam("name") String name, @RequestParam("price") double price){
        Goods goods = new Goods();
        goods.setName(name);
        goods.setPrice(price);
        goodsService.save(goods);
        return "redirect:goodsList";
    }

    @PostMapping("/newGoods")
    public String newGoods(@ModelAttribute Goods goods){
        goodsService.save(goods);
        return "redirect:goodsList";
    }

    @GetMapping("/editG/{id}")
    public String editPage(@PathVariable("id") int id, Model model) {
        System.out.println("id = " + id);
        model.addAttribute("goods", goodsService.getById(id));
        return "editGoods";
    }

    @PostMapping("/editGoods")
    public String editUser(@ModelAttribute Goods goods, Model model) {
        goodsService.update(goods);
        return "redirect:editG/" + goods.getId();
    }

    @PostMapping("/deleteGoods")
    public String deleteGoods(@ModelAttribute("id") int id){
        goodsService.delete(id);
        return "redirect:goodsList";
    }

    @GetMapping("/deleteGoods/{id}")
    public String deleteUser(@PathVariable("id") int id) {
        goodsService.delete(id);
        return "redirect:/goodsList";
    }

}
