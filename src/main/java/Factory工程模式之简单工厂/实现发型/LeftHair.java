package Factory工程模式之简单工厂.实现发型;

/**
 * @Date: 2018/12/26 14:45
 * @Description:
 */
public class LeftHair implements  HairInterface {
    @Override
    public void draw() {
        System.out.println("-----左偏分发型---");
    }
}
