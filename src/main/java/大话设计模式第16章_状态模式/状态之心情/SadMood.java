package 大话设计模式第16章_状态模式.状态之心情;

/**
 * @Author: fang
 * @Date: 2019/1/18 23:02
 * @Description:
 */
public class SadMood implements  Mood {
    @Override
    public void perform() {
        System.out.println("今天很沮丧，呜呜");
    }
}
