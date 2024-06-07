package calculator.operator;

public class Plus implements Operator {
    @Override
    public String getOperatorChar() {
        return "+";
    }

    @Override
    public String getOperatorName() {
        return "덧셈";
    }

    @Override
    public String operate(String a, String b) throws IllegalArgumentException {
        try {
            int n1 = Integer.parseInt(a);
            int n2 = Integer.parseInt(b);
            return String.valueOf(n1+n2);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input for Plus: " + a + ", " + b);
        }
    }
}
