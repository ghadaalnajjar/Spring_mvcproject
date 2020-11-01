package com.example.mvcproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Home<Contact> {

    @GetMapping("/index")
    public String indexPage() {
        return "index";
    }

    @GetMapping("/contact")
    public String contactPage() {
        return "contact";
    }

    @PostMapping("/contact")
    public String contact(@RequestParam("contact") String contact) {
        return "contact";
    }

    @GetMapping("/contactList")
    public String ContactList(Model model) {
        List<String> contactList = new ArrayList<>();
        model.addAttribute("contacts", contactList);
        return "contact";

    }

    @RequestMapping("/thymeleaf")
    public String save(Model model) {
        Contact contact = null;
        model.addAttribute("contact", contact);
        return "contact";
    }

    @GetMapping("/about")
    public String viewPage(){
        return "about";
    }

    @GetMapping("/fever")
    public String check(Model model) {
        boolean fever = false;
        model.addAttribute("fever", false );
        return "fever";
    }
}
