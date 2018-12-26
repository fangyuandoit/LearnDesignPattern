package Visitor访问者模式.马;

/**
 * @Auther: fy fangyuan@i-soon.net
 * @Date: 2018/12/26 17:11
 * @Description:
 */
public class BlackHorse implements  Horse {
    @Override
    public void run() {
        System.out.println("这是一匹黑马，跑");
    }
}
