package com.shlang.springpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetsController {

    @RequestMapping("/vets")
    String list(){
        return "vets/list";
    }
}
