package 大话设计模式第17章_适配器模式.笔记本充电;

/**
 * @Author: fang
 * @Date: 2019/1/22 22:57
 * @Description:  二相转三相插座适配器
 */
public class TwoPlugAdapter implements  ThreePlugIf {
           private GBTwoPlug gbTwoPlug =new GBTwoPlug();


    @Override
    public void powerWithThree() {

        System.out.println("通过转化");
        gbTwoPlug.powerWithTwo();

    }
}
