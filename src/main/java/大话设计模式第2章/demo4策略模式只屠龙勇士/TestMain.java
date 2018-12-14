package 大话设计模式第2章.demo4策略模式只屠龙勇士;

public class TestMain {

    public static void main(String[] args) {

        DragonSlayer slayer = new DragonSlayer();

        System.out.println("\n幼龙出现啦");

        slayer.goToBattle();
        /*-************世界安静了片刻**************-*/

        System.out.println("\n冰龙出现啦!");

        //屠龙勇士发现可以用火克制他, 于是换了火器策略, 进行攻击
        slayer.changeStrategy(new FireStrategy()).goToBattle();

        /*-************世界安静了片刻**************-*/

        System.out.println("\n远古巨龙出现啦!");

        // 巨龙太强大了, 只能装备好念魔咒这个技能, 然后攻击
        slayer.changeStrategy(new SpellStrategy()).goToBattle();

        /*-************世界安静了片刻**************-*/

        System.out.println("\n魔龙出现啦");

        // 屠龙勇士用光了所有策略, 现场学会了一个新的技能, 还没来得及给这个技能起名字呢, 屠龙要紧, 快快快
        slayer.changeStrategy(new DragonSlayingStrategy() {
            @Override
            public void execute() {
                System.out.println("神秘技能: 顿悟出一套从天而降的掌法, 如来神掌!");
            }
        }).goToBattle();

        /*-************世界安静了片刻**************-*/
        System.out.println("\n神龙出现啦");

        // 屠龙勇士利用函数式编程发明了一种新的神级招式: 洗脑
        slayer.changeStrategy(()-> System.out.println("洗脑策略: 洗脑~~~~~~")).goToBattle();

    }
}
