//package com.maktab.busticket.controller;
//
//import com.maktab.busticket.entity.Customer;
//import com.maktab.busticket.service.CustomerService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//
//import javax.validation.Valid;
//
//@Controller
//public class CustomerController {
//
//    @Autowired
//    private CustomerService customerService;
//
//    @GetMapping("/sing-up")
//    public String display(Customer customer) {
//        return "sing-up";
//    }
//
//    @PostMapping("/add-customer")
//    public String addCustomer(@Valid Customer customer, BindingResult result, Model model) {
//        if (result.hasErrors()) {
//            return "add-user";
//        }
//        customerService.addCustomer(customer);
//        return "redirect:/index";
//    }
//
////    @GetMapping("/index")
////    public String showUsers(Model model) {
////        List<User> users = userService.showAllUser();
////        model.addAttribute("users", users);
////        return "index";
////    }

//}
