package 大话设计模式第2章.demo4策略模式只屠龙勇士;


/**
 * 念魔咒策略
 */
public class SpellStrategy implements  DragonSlayingStrategy {
    @Override
    public void execute() {
        System.out.println("魔咒策略: 念魔咒把龙封印掉");
    }
}
