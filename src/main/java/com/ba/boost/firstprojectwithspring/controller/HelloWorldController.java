package com.ba.boost.firstprojectwithspring.controller;

import com.ba.boost.firstprojectwithspring.model.dto.request.MathAdditionRequest;
import com.ba.boost.firstprojectwithspring.service.IMathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    /*
    * localhost:8080/hello/v1
    *
    * */

    @GetMapping("/v1")
    public String helloWorld() {
        return "Hello World";
    }

    @Autowired
    private IMathService mathService;

    /*
     * localhost:8080/hello/v2
     *
     * */

    @PostMapping("/v2")
    public Integer addition(@RequestBody MathAdditionRequest request) {
        return mathService.addition(request);
    }
}
