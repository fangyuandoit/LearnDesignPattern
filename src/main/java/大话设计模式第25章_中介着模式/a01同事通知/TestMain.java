package 大话设计模式第25章_中介着模式.a01同事通知;

/**
 * @Author: fang
 * @Date: 2019/2/23 22:08
 * @Description:
 */
public class TestMain {

    public static void main(String[] args) {

        ConcreteMediator m =new ConcreteMediator();
        ConcreteColleague1 c1 =new ConcreteColleague1(m);
        ConcreteColleague2 c2 =new ConcreteColleague2(m);

        m.setColleague1(c1);
        m.setColleague2(c2);

        c1.Send("你吃了吗");
        c2.Send("没有呢，你打算请客？");


    }

}
