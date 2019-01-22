package 大话设计模式第17章_适配器模式.a01理论;

/**
 * @Author: fang
 * @Date: 2019/1/22 22:42
 * @Description:
 */
public class TestMain {

    public static void main(String[] args) {

        Target target =new Adapter();
        target.request();

    }
}
