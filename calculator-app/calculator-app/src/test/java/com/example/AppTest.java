package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

/**
 * JUnit 5 test for App.
 */
public class AppTest {

    @Test
    void mainRunsWithoutException() {
        assertDoesNotThrow(() -> App.main(new String[]{}));
    }
}
