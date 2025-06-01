package com.vedant.springboot.mvc.controller;

import com.vedant.springboot.mvc.model.Customer;
import jakarta.validation.Valid;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;


@Controller
public class CustomerController {
    //adding init binder to convert input stringd
    //remove leading and trailing whitespaces
    //resolve validation issue
    @InitBinder
    public void initBinder(WebDataBinder dataBinder){
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

    @GetMapping("/")
    public String showForm(Model theModel){
        theModel.addAttribute("customer", new Customer());
        return "customer-form";
    }

    @PostMapping("/processForm")
    public String processForm(@Valid @ModelAttribute("customer") Customer theCustomer,
                              BindingResult theBindingResult){
        System.out.println("Last name: |"+ theCustomer.getLastName() + "|");
        if(theBindingResult.hasErrors()){
            return "customer-form";
        }else{
            return "customer-confirmation";
        }
    }
}
