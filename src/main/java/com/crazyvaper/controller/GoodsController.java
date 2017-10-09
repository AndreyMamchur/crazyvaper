package com.crazyvaper.controller;


import com.crazyvaper.entity.Goods;
import com.crazyvaper.entity.TypeOfGoods;
import com.crazyvaper.service.interfaces.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @GetMapping("/goods/{id}")
    public String getGoods(@PathVariable("id") long id, Model model){
        Goods goodsById = goodsService.getById(id);
        model.addAttribute("goods", goodsById);
        return "showGoods";
    }

    @GetMapping("/goodsList")
    public String showAllGoods(Model model){
        model.addAttribute("goodsList", goodsService.getAll());
        return "goodsList";
    }

    @GetMapping("/ecigsList")
    public String showEcigs(Model model){
        model.addAttribute("goodsList", goodsService.getGoodsListByType(TypeOfGoods.ECIGS));
        return "ecigsList";
    }

    @GetMapping("/eliquidList")
    public String showEliquid(Model model){
        model.addAttribute("goodsList", goodsService.getGoodsListByType(TypeOfGoods.ELIQUID));
        return "eliquidList";
    }

    @GetMapping("/modsList")
    public String showMods(Model model){
        model.addAttribute("goodsList", goodsService.getGoodsListByType(TypeOfGoods.MODS));
        return "modsList";
    }

    @GetMapping("/atomizersList")
    public String showAtomizers(Model model){
        model.addAttribute("goodsList", goodsService.getGoodsListByType(TypeOfGoods.ATOMIZERS));
        return "atomizersList";
    }

    @GetMapping("/accessoriesList")
    public String showAccessories(Model model){
        model.addAttribute("goodsList", goodsService.getGoodsListByType(TypeOfGoods.ACCESSORIES));
        return "accessoriesList";
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
    public String editPage(@PathVariable("id") long id, Model model) {
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
    public String deleteGoods(@ModelAttribute("id") long id){
        goodsService.delete(id);
        return "redirect:goodsList";
    }

    @GetMapping("/deleteGoods/{id}")
    public String deleteUser(@PathVariable("id") long id) {
        goodsService.delete(id);
        return "redirect:/goodsList";
    }

    @GetMapping("/sortGoodsByPrice")
    public String sortGoodsByPrice(Model model){
        model.addAttribute("goodsList", goodsService.sortByPrice(goodsService.getAll()));
        return "goodsList";
    }

    @GetMapping("/sortGoodsByName")
    public String sortGoods(Model model){
        model.addAttribute("goodsList", goodsService.sortByName(goodsService.getAll()));
        return "goodsList";
    }

}
