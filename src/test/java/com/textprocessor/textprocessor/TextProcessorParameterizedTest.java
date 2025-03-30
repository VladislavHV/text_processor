package com.textprocessor.textprocessor;

import com.textprocessor.textprocessor.service.TextProcessorService;
import com.textprocessor.textprocessor.service.TextProcessorServiceImpl;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextProcessorParameterizedTest {

    private final TextProcessorService textProcessorService = new TextProcessorServiceImpl();

    @ParameterizedTest
    @CsvSource({
            "hello, olleh",
            "vlad!, !dalv"
    })
    void textProcessorHello(String text, String expected) {
        assertEquals(expected, textProcessorService.textProcessorHello(new StringBuilder(text)).toString());
    }

    @ParameterizedTest
    @CsvSource({
            "hello, HELLO",
            "vlad@, VLAD@"
    })
    void textProcessorUpperCase(String text, String expected) {
        assertEquals(expected, textProcessorService.textProcessorUpperCase(text));
    }

    @ParameterizedTest
    @CsvSource({
            "HELLO, hello",
            "VLAD3, vlad3"
    })
    void textProcessorLowerCase(String text, String expected) {
        assertEquals(expected, textProcessorService.textProcessorLowerCase(text));
    }

    @ParameterizedTest
    @CsvSource({
            "hello, 5",
            "vlad, 4"
    })
    void textProcessorLength(String text, int expected) {
        assertEquals(expected, textProcessorService.textProcessorLength(text));
    }

    @ParameterizedTest
    @CsvSource({
            "hello, world, helloworld",
            "vlad, 2!, vlad2!"
    })
    void textProcessorConcat(String text1, String text2, String expected) {
        assertEquals(expected, textProcessorService.textProcessorConcat(text1, text2));
    }

}
