package 大话设计模式第6章.装饰着模式模式02_装饰女士;

public class PoliteWomen extends  WrapperWomen {
    public PoliteWomen(Woman woman) {
        super(woman);
    }

    @Override
    public void say() {
        System.out.println("大家好");
        super.say();
        System.out.println("多多关照");
    }
}
