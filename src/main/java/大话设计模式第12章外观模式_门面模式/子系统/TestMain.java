package 大话设计模式第12章外观模式_门面模式.子系统;

/**
 * @Author: fang
 * @Date: 2019/1/4 23:05
 * @Description:
 */
public class TestMain {

    public static void main(String[] args) {

        Facade facade = new Facade();
        facade.methodA();
        facade.methodB();

    }

}
