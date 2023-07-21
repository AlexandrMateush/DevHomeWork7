package org.example;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class HttpStatusCheckerTest {

    @Test
    void testValidStatusCode() throws IOException {
        HttpStatusChecker checker = new HttpStatusChecker();
        int validStatusCode = 200;
        String expectedUrl = "https://http.cat/200.jpg";
        String actualUrl = checker.getStatusImage(validStatusCode);
        assertEquals(expectedUrl, actualUrl);
    }
    @Test
    void testInvalidStatusCode()  {
        HttpStatusChecker checker = new HttpStatusChecker();
        int invalidStatusCode = 1000;
        assertThrows(IllegalArgumentException.class,
                () -> checker.getStatusImage(invalidStatusCode));

    }
}