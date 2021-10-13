package com.apiDemoTest2;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")

public class APIRestController {

    @PostMapping("/consumer_services")
    public String customerDetailedInquiry(){
        System.out.println("Found");
        return "done";
    }

}
