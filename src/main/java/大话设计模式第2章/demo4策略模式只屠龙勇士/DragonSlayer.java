package 大话设计模式第2章.demo4策略模式只屠龙勇士;


//屠龙勇士有一个默认策略, 还可以进行替换策略的操作, 还可以使用当前的策略来进行攻击
public class DragonSlayer  {

    /**
     * 屠龙策略
     */
    private DragonSlayingStrategy strategy;


    /**
     * 如果是空参构造器, 那么赋上一个默认的策略
     */
    public DragonSlayer() {
        strategy =new DragonSlayingStrategy() {
            @Override
            public void execute() {
                System.out.println("默认策略: 拳打脚踢");
            }
        };
    }

    /**
     * 传入一个策略, 根据这个策略来进行实例化屠龙勇士
     */
    public DragonSlayer(DragonSlayingStrategy strategy) {
        this.strategy = strategy;
    }

    public DragonSlayer changeStrategy(DragonSlayingStrategy strategy){
        this.strategy = strategy;
        return this;
    }

    /**
     * 使用当前策略来执行屠龙
     */
    public void goToBattle() {
        strategy.execute();
    }




}
