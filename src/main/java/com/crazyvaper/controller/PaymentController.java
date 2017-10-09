package com.crazyvaper.controller;

import com.crazyvaper.entity.Payment;
import com.crazyvaper.service.interfaces.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/payment/{id}")
    public String Payment(@PathVariable("id") long id, Model model) {
        model.addAttribute("payment", paymentService.getById(id));
        return "showPayment";
    }

    @GetMapping("/paymentList")
    public String getAllPayments(Model model) {
        model.addAttribute("paymentList", paymentService.getAll());
        return "paymentList";
    }

    @PostMapping("/newPayment")
    public String createPayment(@ModelAttribute Payment payment) {
        paymentService.save(payment);
        return "redirect:payments";
    }

    @GetMapping("/editP/{id}")
    public String editPage(@PathVariable("id") long id, Model model) {
        System.out.println("id = " + id);
        model.addAttribute("payment", paymentService.getById(id));
        return "editPayment";
    }

    @PostMapping("/editPayment")
    public String editPayment(@ModelAttribute Payment payment, Model model) {
        paymentService.update(payment);
        return "redirect:editP/" + payment.getId();
    }

    @GetMapping("/deletePayment/{id}")
    public String deletePayment(@PathVariable("id") long id) {
        paymentService.delete(id);
        return "redirect:/payments";
    }

    @PostMapping("/deletePayment")
    public String deletePayment2(@ModelAttribute("id") long id) {
        paymentService.delete(id);
        return "redirect:payments";
    }
}
