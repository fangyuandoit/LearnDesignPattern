package 大话设计模式第1章.第二个计算器;

public class OperationWay{


}

class  OperationAdd extends  Operation{

    @Override
    public double getResult(double a, double b) {
        return a+b;
    }
}

class  OperationSub extends  Operation{

    @Override
    public double getResult(double a, double b) {
        return a-b;
    }
}

class OperationMul extends  Operation{

    @Override
    public double getResult(double a, double b) {
        return a*b;
    }
}

class OperationDiv extends  Operation{

    @Override
    public double getResult(double a, double b) {
        return a/b;
    }
}