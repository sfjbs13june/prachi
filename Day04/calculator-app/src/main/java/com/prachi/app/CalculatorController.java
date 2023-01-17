package com.prachi.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CalculatorController {
    @GetMapping("/add")
    public Double add(@RequestParam("a") Double a,@RequestParam("b") Double b){return a+b;}

    @GetMapping("/sub")
    public Double sub(@RequestParam("a") Double a,@RequestParam("b") Double b){return a-b;}

    @GetMapping("/mul")
    public Double mul(@RequestParam("a") Double a,@RequestParam("b") Double b){return a*b;}

    @GetMapping("/div")
    public Double div(@RequestParam("a") Double a,@RequestParam("b") Double b){return a/b;}


}
