package com.aplication.inventorysystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@CrossOrigin(origins = "http://localhost:8080")
@SpringBootApplication
@EnableSwagger2
public class InventorysystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventorysystemApplication.class, args);
    }
}
