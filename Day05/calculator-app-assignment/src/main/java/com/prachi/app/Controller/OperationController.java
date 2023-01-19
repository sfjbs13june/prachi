package com.prachi.app.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class OperationController {

    @GetMapping("/add")
    public Long add(@RequestParam("a") Long a,@RequestParam("b") Long b)
    {return a+b;}

    @PostMapping("/sub")
    public Long sub(@RequestParam("a") Long a, @RequestParam("b") Long b)
    {return a-b;}

    @PutMapping("/mul")
    public Long mul(@RequestParam("a") Long a, @RequestParam("b") Long b)
    {return a*b;}

    @DeleteMapping("/div")
    public Long div(@RequestParam("a") Long a,@RequestParam("b") Long b)
    {return a/b;}

}


