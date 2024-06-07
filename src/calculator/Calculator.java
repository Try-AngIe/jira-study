package calculator;

import calculator.operator.Operator;

import java.util.*;

public class Calculator {

    private final Map<String, Operator> operators;

    /**
     * @param operators 계산기에 등록할 연산자 목록
     * */
    public Calculator(Operator... operators) {
        this.operators = new HashMap<>();
        for (Operator operator : operators) {
            this.operators.put(operator.getOperatorChar(), operator);
        }
    }

    /**
     * 연산 수행
     *
     * @param input 연산을 수행할 수식.
     *              피연산자 2개와 연산자 1개로 이루어져있으며,
     *              각 항목 사이에는 하나의 띄어쓰기가 존재해야 한다.
     *              ex) 1 + 1, 2 * 3 ...
     * @return 연산 수행 결과 문자열
     * @throws IllegalFormatException 포맷 형식에 맞지 않은 수식
     * @throws IllegalArgumentException 등록되어있지 않은 연산자 or 연산 수행 실패
     * */
    public String operate(String input) throws IllegalArgumentException {
        String[] tokens = input.split(" ");

        if (tokens.length < 3) {
            throw new IllegalArgumentException("Illegal Format of Expression " + input);
        }

        Operator operator = this.operators.get(tokens[1]);
        if (operator == null) {
            throw new IllegalArgumentException("Unknown operator: " + tokens[0]);
        }

        return operator.operate(tokens[0] , tokens[2]);
    }

    public String getOperatorInfo() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Operator> entry : this.operators.entrySet()) {
            Operator operator = entry.getValue();
            sb.append(String.format("%s(%s)\n", operator.getOperatorName(), operator.getOperatorChar()));
        }
        return sb.toString();
    }
}
