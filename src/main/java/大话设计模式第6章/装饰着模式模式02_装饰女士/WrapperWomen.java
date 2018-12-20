package 大话设计模式第6章.装饰着模式模式02_装饰女士;

public class WrapperWomen extends  Woman{

    private Woman woman;

    public WrapperWomen(Woman woman) {
        super(woman.getBeautyIndeex(), woman.getIq(), woman.getName());
        this.woman =woman;
    }

    @Override
    public int getBeautyIndeex() {
        return woman.getBeautyIndeex();
    }

    @Override
    public int getIq() {
        return woman.getIq();
    }

    @Override
    public void say() {
        woman.say();
    }
}
