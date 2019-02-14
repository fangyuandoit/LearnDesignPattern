package 大话设计模式第18章_备忘录模式.a01理论;

/**
 * @Author: fang
 * @Date: 2019/2/14 22:26
 * @Description:
 */
public class TestMain {

    public static void main(String[] args) {

        //originator初始状态，状态属性为on
        Originator o = new Originator();
        o.setState("On");
        o.Show();


        //保存状态时，由于封装性，隐藏了originator的细节
        CareTaker c =new CareTaker();
        c.setMemento(o.CreateMemento());


        //originator改变状态属性为off
        o.setState("OFF");
        o.Show();


        //恢复初始状态
        o.SetMemento(c.getMemento());
        o.Show();

    }
}
