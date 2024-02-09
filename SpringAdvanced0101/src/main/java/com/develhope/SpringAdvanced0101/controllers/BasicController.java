package com.develhope.SpringAdvanced0101.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/v1")
public class BasicController {

    @GetMapping("/show/currenttime")
    public @ResponseBody LocalDateTime showCurrentDateAndTime() {
        return LocalDateTime.now();
    }

    @GetMapping("show/legacy")
    public @ResponseBody String showLegacy() {
        return "This is just old code";
    }
}
