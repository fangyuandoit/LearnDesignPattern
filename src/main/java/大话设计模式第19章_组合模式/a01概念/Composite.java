package 大话设计模式第19章_组合模式.a01概念;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: fang
 * @Date: 2019/2/15 22:01
 * @Description: 定义枝节点行为，用来存储子部件。有add  remove操作
 */
public class Composite extends  Component{

    private List<Component> children =new LinkedList<>();
    public Composite(String name ){
        super(name);
    }

    @Override
    public void Add(Component c) {
        children.add(c);
    }

    @Override
    public void Remove(Component c) {
        children.remove(c);
    }

    @Override
    public void Display(int depth) {

        for (int i=0;i<depth;i++){
            System.out.print("-");
        }
        System.out.println(name);

        for(Component component:children){
             component.Display(depth+2);
        }


    }
}
