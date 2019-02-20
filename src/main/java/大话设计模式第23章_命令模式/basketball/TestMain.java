package 大话设计模式第23章_命令模式.basketball;

/**
 * @Author: fang
 * @Date: 2019/2/20 22:31
 * @Description:
 */
public class TestMain {

    public static void main(String[] args) {

        NbaGameHandler handler =new NbaGameHandler();
        handler.setA(new BlockCommand());
        handler.setB(new PickandrollCommand());
        handler.setC(new StealCommand());
        handler.setD(new ShootCommand());

        handler.pushA();
        handler.pushB();
        handler.pushC();
        handler.pushD();

    }

}
