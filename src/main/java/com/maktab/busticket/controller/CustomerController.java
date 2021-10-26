package com.maktab.busticket.controller;

import com.maktab.busticket.entity.Customer;
import com.maktab.busticket.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {

//    @GetMapping("/sign-up")
//    public String sign_up(){
//        return "sign-up";
//    }
    @GetMapping("/sign-up")
    public String signup(Model model)
    {
        model.addAttribute("username",new Customer());
        return "sign-up";
    }







    @PostMapping("/login")
    public String login(Model model)
    {
        model.addAttribute("password",new Customer());
        return "login";
    }

















//    @Autowired
//    private CustomerService customerService;
//
//    @GetMapping ("/sign-up")
//    public String signUp(){
//        return "sign-up";
//    }
//    @PostMapping("/addCustomer")
//    public String addCustomer(Customer customer){
//        customerService.addCustomer(customer);
//        return "redirect:/sign-up";
//    }
}
