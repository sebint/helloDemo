package com.hellokoding.hello.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView customer() {
       return new ModelAndView("index", "mycustomer", new Customer());
    }
    @RequestMapping(value = "/addCustomer", method = RequestMethod.POST)
    	public String addCustomer(@ModelAttribute("mycustomer")Customer customer, 
                 ModelMap model) {
    			model.addAttribute("name", customer.getUserName());
    				return "details";
    }
}
