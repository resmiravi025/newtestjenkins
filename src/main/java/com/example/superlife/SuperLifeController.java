package com.example.superlife;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SuperLifeController {

    @GetMapping("/mylife")
    public String getSuperLife(){
        return "Wonderful life";
    }
}
