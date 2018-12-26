package Factory工程模式之简单工厂.实现发型;

/**
 * @Date: 2018/12/26 15:15
 * @Description:
 */
public class RightHair implements  HairInterface {
    @Override
    public void draw() {
        System.out.println("-----右偏分发型---");
    }
}
