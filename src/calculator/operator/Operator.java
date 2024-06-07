package calculator.operator;

public interface Operator {

    /**
     * 연산자 기호 확인
     *
     * @return 연산자 기호 ex) +,-,/,*
     * */
    String getOperatorChar();

    /**
     * 연산자 이름 확인
     *
     * @return 연산자 이름 ex) 덧셈, 뺄셈...
     * */
    String getOperatorName();


    /**
     * 연산 수행 후 결과값 확인
     *
     * @return 연산 수행 후 결과값 문자열
     * */
    String operate(String a, String b) throws IllegalArgumentException;
}
