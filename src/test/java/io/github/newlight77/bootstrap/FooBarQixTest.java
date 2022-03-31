package io.github.newlight77.bootstrap;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FooBarQixTest {

    @Test
    void noRuleTest() {
        // Arrange
        String input = "1";

        // Act
        String result = new FooBarQix().compute(input);

        // Assert
        assertEquals("1", result);
    }

}
