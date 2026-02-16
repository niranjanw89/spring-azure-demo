package com.azure.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootConfiguration
@RestController
public class SpringAzureDemoApplication {

    @GetMapping("/message")
    public String message(){
        return "Congrats your app is deployed successfully in AZURE !!!!";
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringAzureDemoApplication.class);
    }
}
