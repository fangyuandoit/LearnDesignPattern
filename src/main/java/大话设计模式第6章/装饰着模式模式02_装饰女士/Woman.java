package 大话设计模式第6章.装饰着模式模式02_装饰女士;

public class Woman {

    private int beautyIndeex;
    private int iq;
    private String name;


    public   void say(){
        System.out.println("我的名字叫"+name);
    }

    public Woman(int beautyIndeex, int iq, String name) {
        this.beautyIndeex = beautyIndeex;
        this.iq = iq;
        this.name = name;
    }



    public int getBeautyIndeex() {
        return beautyIndeex;
    }

    public void setBeautyIndeex(int beautyIndeex) {
        this.beautyIndeex = beautyIndeex;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
