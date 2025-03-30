package com.textprocessor.textprocessor;

import com.textprocessor.textprocessor.service.TextProcessorService;
import com.textprocessor.textprocessor.service.TextProcessorServiceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TextProcessorTest {

    private final TextProcessorService textProcessorService = new TextProcessorServiceImpl();

    @Test
    void textProcessorHello() {
        assertEquals("olleh", textProcessorService.textProcessorHello(new StringBuilder("hello")).toString());
        assertEquals("!dalv", textProcessorService.textProcessorHello(new StringBuilder("vlad!")).toString());
    }

    @Test
    void textProcessorUpperCase() {
        assertEquals("HELLO", textProcessorService.textProcessorUpperCase("hello"));
        assertEquals("@VLAD", textProcessorService.textProcessorUpperCase("@vlad"));
    }

    @Test
    void textProcessorLowerCase() {
        assertEquals("hello", textProcessorService.textProcessorLowerCase("HELLO"));
        assertEquals("vlad1", textProcessorService.textProcessorLowerCase("VLAD1"));
    }

    @Test
    void textProcessorLength() {
        assertEquals(5, textProcessorService.textProcessorLength("hello"));
        assertEquals(5, textProcessorService.textProcessorLength("vlad!"));
    }

    @Test
    void textProcessorConcat() {
        assertEquals("helloworld", textProcessorService.textProcessorConcat("hello", "world"));
        assertEquals("vlad2!", textProcessorService.textProcessorConcat("vlad", "2!"));
    }

    @Test
    void textProcessorIllegalArgumentExceptionHello() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> textProcessorService.textProcessorHello(new StringBuilder("")));
        Exception exception1 = assertThrows(IllegalArgumentException.class, () -> textProcessorService.textProcessorHello(null));
        assertEquals("Входная строка не может быть пустой!", exception.getMessage());
        assertEquals("Входная строка не может быть пустой!", exception1.getMessage());
    }

    @Test
    void textProcessorIllegalArgumentExceptionUpperCase() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> textProcessorService.textProcessorUpperCase(""));
        Exception exception1 = assertThrows(IllegalArgumentException.class, () -> textProcessorService.textProcessorUpperCase(null));
        assertEquals("Входная строка не может быть пустой!", exception.getMessage());
        assertEquals("Входная строка не может быть пустой!", exception1.getMessage());
    }

    @Test
    void textProcessorIllegalArgumentExceptionLowerCase() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> textProcessorService.textProcessorLowerCase(""));
        Exception exception1 = assertThrows(IllegalArgumentException.class, () -> textProcessorService.textProcessorLowerCase(null));
        assertEquals("Входная строка не может быть пустой!", exception.getMessage());
        assertEquals("Входная строка не может быть пустой!", exception1.getMessage());
    }

    @Test
    void textProcessorIllegalArgumentExceptionLength() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> textProcessorService.textProcessorLength(""));
        Exception exception1 = assertThrows(IllegalArgumentException.class, () -> textProcessorService.textProcessorLength(null));
        assertEquals("Входная строка не может быть пустой!", exception.getMessage());
        assertEquals("Входная строка не может быть пустой!", exception1.getMessage());
    }

    @Test
    void textProcessorIllegalArgumentExceptionConcat() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> textProcessorService.textProcessorConcat("", ""));
        Exception exception1 = assertThrows(IllegalArgumentException.class, () -> textProcessorService.textProcessorConcat(null, null));
        assertEquals("Входная строка не может быть пустой!", exception.getMessage());
        assertEquals("Входная строка не может быть пустой!", exception1.getMessage());
    }
}
