package com.example.nordic_motorhome.Controller;

import com.example.nordic_motorhome.Model.Customer;
import com.example.nordic_motorhome.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    CustomerService customerService;

    @GetMapping("/")
    public String index() {
        return "home/index";
    }

    @GetMapping("/customer")
    public String customer(Model model){
        List<Customer> customerList = customerService.showCustomer();
        model.addAttribute("customer", customerList);
        return "home/customer";
    }
}
