
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class HW05 {
    
    public static void main(String[] args) {
        // String expression = "(2^3 * (10 / (5 - 3))/10)^)(4/2)"; // dont correct
        String expression = "(2^3 * (10 / (5 - 3))/10)^(4/2)"; // = 16

        if(isCurrentBrackets.CheckCorrectPlacementBrackets(expression)){
            List<String> polishNotationExpression = (polishNotation.fromString(expression));
            int result = calculate(polishNotationExpression);
            System.out.println("\nexpression : \n" + expression);
            System.out.println("\nresult : \n" + result);
        }else{
            System.out.printf("\n %s- dont correct expression\n", expression);
        }

    }

    public static int calculate(List<String> polishNotation) {
        Set<String> operators = Set.of("+", "-", "/", "*", "^");
        Stack<Integer> numbers = new Stack<>();

        for (String element : polishNotation) {
            if (operators.contains(element)) {
                int operand2 = numbers.pop();
                int operand1 = numbers.pop();
                numbers.push(action(operand1, operand2, element));
            } else {
                numbers.push(Integer.valueOf(element));
            }
        }
        return numbers.pop();
    }

    private static int action(int operand1, int operand2, String operator) {
        int result = 0;
        switch (operator) {
            case "+" -> result = operand1 + operand2;
            case "-" -> result = operand1 - operand2;
            case "*" -> result = operand1 * operand2;
            case "/" -> result = operand1 / operand2;
            case "^" -> result = exponentiation(operand1, operand2);
        }
        return result;
    }

    private static int exponentiation(int operand1, int operand2) {
        int result = 1;
        for (int i = 0; i < operand2; i++) {
            result *= operand1;
        }
        return result;
    }
}