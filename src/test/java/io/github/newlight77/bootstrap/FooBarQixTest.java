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
    void shouldComputeTwo_whenHavingTwoAsInput() {
        // Arrange
        String input = "2";

        // Act
        String result = new FooBarQix().compute(input);

        // Assert
        assertEquals("2", result);
    }

    @Test
    void shouldComputeEmptyString_whenHavingEmptyStringAsInput() {
        // Arrange
        String input = "";

        // Act
        String result = new FooBarQix().compute(input);

        // Assert
        assertEquals("", result);
    }

    @Test
    void shouldComputeFoo_whenHavingThree() {
            // Arrange
            String input = "3";

            // Act
            String result = new FooBarQix().compute(input);

            // Assert
            assertEquals("Foo", result);
    }

    @Test
    void shouldComputeBar_whenHavingFive() {
        // Arrange
        String input = "5";

        // Act
        String result = new FooBarQix().compute(input);

        // Assert
        assertEquals("Bar", result);
    }
}
