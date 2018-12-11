package 大话设计模式第1章.第二个计算器;

public class MainTest {

    public static void main(String[] args) {

        Operation oper=OperationFactory.createOperation("+");
        double result = oper.getResult(2,4);
        System.out.println(result);


    }
}
