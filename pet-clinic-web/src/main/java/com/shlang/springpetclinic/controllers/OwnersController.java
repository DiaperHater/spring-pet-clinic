package com.shlang.springpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnersController {

    @RequestMapping("/owners")
    String list(){
        return "owners/list";
    }
}
