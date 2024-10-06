package com.example.demo.controller;

import com.example.demo.model.Order;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OrderController {
    @RequestMapping("/submitOrder")
    public ModelAndView submitOrder(@ModelAttribute("order") Order order){
        double pricePerUnit = 979.00;
        double totalPrice = pricePerUnit * order.getQuantity();
        ModelAndView mview = new ModelAndView();
        mview.setViewName("show-order");
        mview.addObject("order", order);
        mview.addObject("pricePerUnit", pricePerUnit);
        mview.addObject("totalPrice", totalPrice);

        return mview;
    }
}

