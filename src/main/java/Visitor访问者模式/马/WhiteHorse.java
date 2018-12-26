package Visitor访问者模式.马;

/**
 * @Date: 2018/12/26 17:11
 * @Description:
 */
public class WhiteHorse implements  Horse{
    @Override
    public void run() {
        System.out.println("这是一匹白马，跑");
    }
}
