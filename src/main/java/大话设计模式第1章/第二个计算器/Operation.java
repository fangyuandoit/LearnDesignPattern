package 大话设计模式第1章.第二个计算器;

abstract class Operation {

    private double a=0;
    private double b=0;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public   abstract double getResult(double a ,double b);
}
