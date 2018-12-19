package 大话设计模式第7章.代理模式01代理送礼物;

/**
 * 代理男孩子追求者
 */
public class Proxy implements IGiveGift {

    private Pursuit gg;

    public Proxy(SchoolGirl mm) {
        gg = new Pursuit(mm);
    }


    @Override
    public void giveDolls() {
        gg.giveDolls();
    }

    @Override
    public void giveFlower() {
        gg.giveFlower();
    }

    @Override
    public void giveChocolate() {
        gg.giveChocolate();
    }
}
