package 大话设计模式第17章_适配器模式.a01理论;

/**
 * @Author: fang
 * @Date: 2019/1/22 22:40
 * @Description: 通过在内部包装一个Adapter对象，把源接口转换成目标接口
 */
public class Adapter  extends   Target{

    private Adaptee adaptee =new Adaptee();

    @Override
    void request() {
       // super.request();
        adaptee.specificRequest();
    }
}
