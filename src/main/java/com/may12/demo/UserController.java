package com.may12.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

   // @Autowired // Field Autowiring
    private DemoService demoService;// = new DemoServiceImpl();
    // HAS-A relation
    // Dependency

    @Autowired // Constructor autowiring
    public UserController(DemoService demoService) {
        // customise or look after the injected bean
        System.out.println("Constructor injection");
        this.demoService = demoService;
    }
   // @Autowired // Setter Dependency injection (DI)
    public void setDemoService(DemoService demoService) {
        System.out.println("Setter injection");
        this.demoService = demoService;
    }

    @GetMapping("/info")
    public String getInfo(){
        return this.demoService.info();
    }

}
