package com.example.azuremicrosoft;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Webcontroller {


    @GetMapping("/getAzure")
    public String message(){
        return "Congrats! your app got successfully deployed in Azure!";
    }
}
