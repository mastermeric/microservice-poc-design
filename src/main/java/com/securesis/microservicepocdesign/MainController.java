package com.securesis.microservicepocdesign;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    
    public MainController() {
        super();        
    }

    @GetMapping("HealthCheck")
    public String TryHealthCheck() {

        return "OK..done!";
    }
    
}
