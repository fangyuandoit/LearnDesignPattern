package 大话设计模式第7章.代理模式01代理送礼物;

/**
 * 追求者 男孩子类
 */
public class Pursuit implements IGiveGift{

    SchoolGirl mm;

    public Pursuit(SchoolGirl mm) {
        this.mm = mm;
    }


    @Override
    public void giveDolls() {
        System.out.println(mm.getName()+"give you dolls");
    }

    @Override
    public void giveFlower() {
        System.out.println(mm.getName()+"give you flower");
    }

    @Override
    public void giveChocolate() {
        System.out.println(mm.getName()+"give you chocolate");
    }
}
