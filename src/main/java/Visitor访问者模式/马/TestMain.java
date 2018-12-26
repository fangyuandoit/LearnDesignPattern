package Visitor访问者模式.马;

/**
 * @Date: 2018/12/26 17:12
 * @Description:
 */
public class TestMain {

    public static void main(String[] args) {
           Horse bh =new BlackHorse();
           Horse wh =new WhiteHorse();

           bh.run();
           wh.run();


    }
}
