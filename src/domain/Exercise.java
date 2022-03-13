package domain;

import java.util.ArrayList;
import java.util.List;

/**
 * The class provides the functionality to calculate string equation
 */
public class Exercise {
    /**
     * Performs calculation
     */
    public static float calculate(String equation){
        List<Float> elements = new ArrayList<>();
        List<Character> operators = new ArrayList<>();
        float result = 0f;

        // Separate numbers and operators
        String fragment = "";
        for(int i = 0; i < equation.length(); i++) {
            if(equation.charAt(i) == ' ') continue;
            if(equation.charAt(i) >= '0' && equation.charAt(i) <= '9') {
                fragment += equation.charAt(i);
            }
            else {
                operators.add(equation.charAt(i));
                elements.add(Float.parseFloat(fragment));
                fragment = "";
            }
        }
        elements.add(Float.parseFloat(fragment));

        // Calculate
        result += elements.get(0);
        for(int i = 0; i < operators.size(); i++) {
            switch (operators.get(i)) {
                case '+' -> result += elements.get(i + 1);
                case '-' -> result -= elements.get(i + 1);
                case '*' -> result *= elements.get(i + 1);
                case '/' -> result /= elements.get(i + 1);
            }
        }

        return result;
    }
}
