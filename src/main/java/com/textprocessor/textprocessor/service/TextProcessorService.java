package com.textprocessor.textprocessor.service;

public interface TextProcessorService {

    StringBuilder textProcessorHello(StringBuilder hello);

    String textProcessorUpperCase(String text);

    String textProcessorLowerCase(String text);

    int textProcessorLength(String text);

    String textProcessorConcat(String text1, String text2);
}
