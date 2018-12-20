package 大话设计模式第6章.装饰着模式模式02_装饰女士;

public class DressedUpWomen extends WrapperWomen {
    public DressedUpWomen(Woman woman) {
        super(woman);
    }

    @Override
    public int getBeautyIndeex() {
        return super.getBeautyIndeex()+20;
    }
}
