package com.textprocessor.textprocessor.service;

import org.springframework.stereotype.Service;

@Service
public class TextProcessorServiceImpl implements TextProcessorService {

    @Override
    public StringBuilder textProcessorHello(StringBuilder text) {
        if (text == null || text.isEmpty()) {
            throw new IllegalArgumentException("Входная строка не может быть пустой!");
        }
        return text.reverse();
    }

    @Override
    public String textProcessorUpperCase(String text) {
        if (text == null || text.isEmpty()) {
            throw new IllegalArgumentException("Входная строка не может быть пустой!");
        }
        return text.toUpperCase();
    }

    @Override
    public String textProcessorLowerCase(String text) {
        if (text == null || text.isEmpty()) {
            throw new IllegalArgumentException("Входная строка не может быть пустой!");
        }
        return text.toLowerCase();
    }

    @Override
    public int textProcessorLength(String text) {
        if (text == null || text.isEmpty()) {
            throw new IllegalArgumentException("Входная строка не может быть пустой!");
        }
        return text.length();
    }

    @Override
    public String textProcessorConcat(String text1, String text2) {
        if (text1 == null || text2 == null || text1.isEmpty() || text2.isEmpty()) {
            throw new IllegalArgumentException("Входная строка не может быть пустой!");
        }
        return text1.concat(text2);
    }

}
