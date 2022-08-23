package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.service.ReportService;

@Controller

public class HelloWorldController {

    @Autowired
    ReportService service;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String helloWorld(Model model) {
        model.addAttribute("message", "Hello World!!");
        return "index";
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String helloWorld_2(Model model) {

        int a = 1;
        int b = service.countAll(a);

        model.addAttribute("message", b);

        return "create";
    }
}