package 大话设计模式第19章_组合模式.a01概念;

/**
 * @Author: fang
 * @Date: 2019/2/15 21:55
 * @Description:  lead 在组合种表示叶节点对象，叶节点没有子节点
 */
public class Leaf extends  Component {

    public Leaf(String name){
         super(name);
    }

    @Override
    public void Add(Component c) {
        System.out.println("cannot add to a leaf");
    }

    @Override
    public void Remove(Component c) {
        System.out.println("cannot remove from  a leaf");
    }

    @Override
    public void Display(int depth) {
        for (int i=0;i<depth;i++){
            System.out.print("-");
        }
        System.out.println(name);
    }
}
