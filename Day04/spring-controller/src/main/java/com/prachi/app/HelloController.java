package com.prachi.app;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @GetMapping ("/hello")
    public String SayHello()
    {
        return "Hello from App";
    }

    @RequestMapping("/request/hello")
    public String RequestHello()
    {
        return "Hello from Request Mapping";
    }

    @GetMapping("/welcome")
    public String welcome(@RequestParam("name") String name){
        return "Welcome to "+name;
    }

    @GetMapping("send/{message}")
    public String sendMessage(@PathVariable String message){
        return "Send message "+message;
    }
}
