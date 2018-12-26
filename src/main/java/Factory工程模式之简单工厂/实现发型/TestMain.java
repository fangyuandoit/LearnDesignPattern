package Factory工程模式之简单工厂.实现发型;

/**
 * @Date: 2018/12/26 15:31
 * @Description:
 */
public class TestMain {

    public static void main(String[] args) throws Exception{


        HairFactory factory =new  HairFactory();
        factory.getHair("left").draw();
        factory.getHairByClass("Factory工程模式之简单工厂.实现发型.LeftHair").draw();

    }

}
