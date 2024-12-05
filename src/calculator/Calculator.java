package calculator;

@FunctionalInterface
interface Operator<T> {
    // What signature is suitable for Operator's abstract method?
    void dummyMMethod();
}

public class Calculator {
    public static Integer add(Integer a, Integer b) {
        // fix lambda expression
        return eval(null, a, b);
    }

    public static Integer subtract(Integer a, Integer b) {
        // fix lambda expression
        return eval(null, a, b);
    }

    private static <T extends Number> T eval(Operator<T> opr, T a, T b) {
        /*
         opr needs to perform an operation on TWO operands
         naturally, result should be of the same type

         How should opr be used?
         */
        return null;
    }
}
