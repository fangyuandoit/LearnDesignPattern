package 大话设计模式第1章.第一个计算器;

public class Operation {

    public static double getResult(double a, double b, String operate) {

        double result = 0L;
        switch (operate) {
            case "+":
                result = a + b;
                break;

            case "-":
                result = a - b;
                break;

            case "*":
                result = a * b;
                break;

            case "/":
                result = a / b;
                break;
        }
        return result;
    }

}
