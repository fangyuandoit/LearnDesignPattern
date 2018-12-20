package 大话设计模式第6章.装饰着模式模式02_装饰女士;

public class EducatedWomen extends WrapperWomen {
    public EducatedWomen(Woman woman) {
        super(woman);
    }

    @Override
    public int getIq() {
        return super.getIq()+20;
    }
}
