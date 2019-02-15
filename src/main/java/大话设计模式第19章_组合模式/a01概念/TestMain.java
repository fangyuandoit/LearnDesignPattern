package 大话设计模式第19章_组合模式.a01概念;

/**
 * @Author: fang
 * @Date: 2019/2/15 22:05
 * @Description:
 */
public class TestMain {

    public static void main(String[] args) {


        //生成根root  ，根上长出粮叶leafA，leafB
        Composite root =new Composite("root");
        root.Add(new Leaf("Leaf A"));
        root.Add(new Leaf("Leaf B"));

        //树叶长出分支 composite X,
        Composite comp =new Composite("Composite X");
        comp.Add(new Leaf("Leaf XA"));
        comp.Add(new Leaf("Leaf XB"));
        root.Add(comp);

        root.Display(1);



    }

}
