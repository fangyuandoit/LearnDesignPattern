package Factory工程模式之简单工厂.制造汽车;

/**
 * @Date: 2018/12/26 16:20
 * @Description:
 */
public class HondaCar  implements  ICar{
    @Override
    public void run() {
        System.out.println("我是本田轿车，在路上跑");
    }
}
