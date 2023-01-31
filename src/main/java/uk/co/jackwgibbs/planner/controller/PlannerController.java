package uk.co.jackwgibbs.planner.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlannerController {

    @GetMapping("/home")
    public String home(){
        return "Home";
    }
}
