package io.github.newlight77.bootstrap;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FooBarQixTest {

    @Test
    void shouldComputeOne_whenHavingOneAsInput() {
        // Arrange
        String input = "1";

        // Act
        String result = new FooBarQix().compute(input);

        // Assert
        assertEquals("1", result);
    }

    @Test
    void shouldComputeTwo_whenHavingTowAsInput() {
        // Arrange
        String input = "2";

        // Act
        String result = new FooBarQix().compute(input);

        // Assert
        assertEquals("2", result);
    }

}
