package com.develhope.SpringAdvanced0101.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/legacy")
public class LegacyController {

    @GetMapping("show/legacy")
    public @ResponseBody String showLegacy() {
        return "This is just old code";
    }
}
