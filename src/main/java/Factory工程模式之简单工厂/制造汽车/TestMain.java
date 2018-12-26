package Factory工程模式之简单工厂.制造汽车;

/**
 * @Date: 2018/12/26 16:42
 * @Description:
 */
public class TestMain {

    public static void main(String[] args) throws Exception{

        ICar car = CarFactory.getCar();
        Family Family =new Family(car);
        Family.goOut();

    }

}
