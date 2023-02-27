package com.snva.securityboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

@GetMapping("/admin")
    public String admin(){

        return "for admins only";

    }

    @GetMapping("/user")
    public String user(){
        return "for users only";

    }

    @GetMapping("/premium")
    public String student(){

        return "for Premium members";

    }
}
