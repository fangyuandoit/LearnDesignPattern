package 大话设计模式第16章_状态模式.状态之心情;

/**
 * @Author: fang
 * @Date: 2019/1/18 23:01
 * @Description:
 */
public class HappyMood implements  Mood {
    @Override
    public void perform() {
        System.out.println("今天很开心，啦啦啦");
    }
}
