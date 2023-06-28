package com.example.SLMExam.controller;

import com.example.SLMExam.service.DateService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
@RequestMapping("/api")
public class DateController {
    private final DateService dateService;

    public DateController (DateService service){
        this.dateService = service;
    }
    @GetMapping("/time")
    public LocalTime getTime() {

        return dateService.getTime();
    }
    @GetMapping("/date")
    public String getdate(@RequestParam(required = false) String format) {

        return dateService.getDate(format);
    }
}
