package domain;

/**
 * The class provides the functionality to calculate string equation
 */
public class Exercise {
    /**
     * Performs calculation
     */
    public static float calculate(char []equation){
        float result = 0f;
        String fragment = "";
        char operation = '+';

        for (char c : equation) {
            if (c == ' ') {
                continue;
            }
            if (c >= '0' && c <= '9') {
                fragment += c;
            }
            if(c == '+' || c == '-' || c == '*' || c == '/' || equation[equation.length - 1] == c) {
                switch (operation) {
                    case '+' -> result += Integer.parseInt(fragment);
                    case '-' -> result -= Integer.parseInt(fragment);
                    case '*' -> result *= Integer.parseInt(fragment);
                    case '/' -> result /= Integer.parseInt(fragment);
                }
                fragment = "";
                operation = c;
            }
        }
        return result;
    }
}
