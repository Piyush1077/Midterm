package com.example.midtermspringboot.controller;

import com.example.midtermspringboot.model.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class JokesController {

    @Autowired
    private Model model;

    @RequestMapping(path="/joke")
    public String JokesController(@ModelAttribute("joke") Model model) {
        return "index";
    }


}
