package io.github.newlight77.bootstrap;

public class FooBarQix {

    public String compute(String input) {
        int value = Integer.parseInt(input);
        if (value % 3 == 0) return "Foo";
        if (value % 5 == 0) return "Bar";
        return input;
    }

}
