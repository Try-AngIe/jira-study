import calculator.Calculator;
import calculator.operator.Operator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Operator[] operators = {
//            TODO: Operator 인터페이스 구현 클래스 생성하기
//            new Plus(),
//            new Minus(),
//            new Times(),
//            new Divide()
        };
        Calculator calculator = new Calculator(operators);

        System.out.println("수행 가능 연산자");
        System.out.println(calculator.getOperatorInfo());
        System.out.print("수식: ");
        String input = br.readLine();

        System.out.print("결과: ");
        System.out.println(calculator.operate(input));
    }
}
