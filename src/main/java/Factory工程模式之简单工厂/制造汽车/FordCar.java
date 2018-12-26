package Factory工程模式之简单工厂.制造汽车;

/**
 * @Date: 2018/12/26 16:19
 * @Description:
 */
public class FordCar implements  ICar {
    @Override
    public void run() {
        System.out.println("我是福特轿车，在路上跑");
    }
}
