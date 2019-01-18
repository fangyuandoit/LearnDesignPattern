package 大话设计模式第16章_状态模式.状态之心情;

/**
 * @Author: fang
 * @Date: 2019/1/18 23:03
 * @Description:
 */
public class TestMain {

    public static void main(String[] args) {

        Person p =new Person();
        p.setMood(new SadMood());
        p.perform();

        p.setMood(new MiserableMood());
        p.perform();

        p.setMood(new HappyMood());
        p.perform();



    }

}
