package Factory工程模式之简单工厂.制造汽车;

/**
 * @Date: 2018/12/26 16:17
 * @Description:
 */
public class BenzCar implements  ICar {
    @Override
    public void run() {
        System.out.println("我是奔驰轿车，在路上跑,哈哈哈");
    }
}
