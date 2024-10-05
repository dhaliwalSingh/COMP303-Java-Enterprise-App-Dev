package com.example.demo.controller;

import com.example.demo.model.Order;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class OrderController {

    @PostMapping("/submitOrder")
    public String submitOrder(@ModelAttribute Order order, Model model) {
        // Calculate price
        double pricePerUnit = 979.00; // This would depend on the phone model in a real app
        double totalPrice = pricePerUnit * order.getQuantity();

        // Add the calculated price to the model
        model.addAttribute("order", order);
        model.addAttribute("pricePerUnit", pricePerUnit);
        model.addAttribute("totalPrice", totalPrice);

        // Redirect to the show-order.html page
        return "show-order";
    }
}

