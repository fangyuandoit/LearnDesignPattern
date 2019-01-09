package 大话设计模式第13章_建造者模式_生成器模式.组建电脑;

import com.sun.media.jfxmedia.events.BufferListener;

/**
 * @Author: fang
 * @Date: 2019/1/9 23:19
 * @Description:
 */
public class TestMain {


    public static void main(String[] args) {
        ComputerBuilder builder = new ComputerBuilder();
        Computer computer1 = builder.bulid();
        System.out.println(computer1);

        Computer computer2 = builder.setOs("linux").setBrowser("firefox").bulid();
        System.out.println(computer2);

        computer2.setAdmin("fy");
        computer2.setPassword("123");
        computer2.setLanguage("ZH");
        System.out.println(computer2);

    }

}
