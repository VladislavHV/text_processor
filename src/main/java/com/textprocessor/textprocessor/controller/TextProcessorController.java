package com.textprocessor.textprocessor.controller;

import com.textprocessor.textprocessor.service.TextProcessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/text")
public class TextProcessorController {

    private final TextProcessorService textProcessorService;

    @Autowired
    public TextProcessorController(TextProcessorService textProcessorService) {
        this.textProcessorService = textProcessorService;
    }

    @GetMapping(path = "/reverse")
    public String textProcessorHello(@RequestParam String input) {
        return textProcessorService.textProcessorHello(new StringBuilder(input)).toString();
    }

    @GetMapping(path = "/uppercase")
    public String textProcessorUpperCase(@RequestParam String input) {
        return textProcessorService.textProcessorUpperCase(input);
    }

    @GetMapping(path = "/lowercase")
    public String textProcessorLowerCase(@RequestParam String input) {
        return textProcessorService.textProcessorLowerCase(input);
    }

    @GetMapping(path = "/length")
    public int textProcessorLength(@RequestParam String input) {
        return textProcessorService.textProcessorLength(input);
    }

    @GetMapping(path = "concat")
    public String textProcessorConcat(@RequestParam String input1, @RequestParam String input2) {
        return textProcessorService.textProcessorConcat(input1, input2);
    }
}
