package 大话设计模式第2章.demo4策略模式只屠龙勇士;


/**
 * 火器策略
 */
public class FireStrategy implements  DragonSlayingStrategy {
    @Override
    public void execute() {
        System.out.println("火器策略: 用火烧");
    }
}
