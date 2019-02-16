package 大话设计模式第20章_迭代器模式.a01概念;

/**
 * @Author: fang
 * @Date: 2019/2/16 23:30
 * @Description:
 */
public class TestMain {

    public static void main(String[] args) {

        ConcreteAggregate a =new ConcreteAggregate();
        a.items.add("大鸟");
        a.items.add("小菜");
        a.items.add("行李");

        Iterator i =new ConcreteIterator(a);
        while(!i.IsDone()){
            System.out.println(i.CurrentItem()+"-购买车票");
            i.Next();
        }

    }

}
