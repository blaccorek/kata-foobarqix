package io.github.newlight77.bootstrap;

public class FooBarQix {

    public String compute(String input) {
        int value = Integer.parseInt(input);

        String result = "";
        if (value % 3 == 0) {
            result += "Foo";
        }
        if (value % 5 == 0) {
            result += "Bar";
        }
        if (!result.isEmpty()) {
            return result;
        }
        return input;
    }

}
