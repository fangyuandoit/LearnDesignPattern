package 大话设计模式第20章_迭代器模式.a01概念;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: fang
 * @Date: 2019/2/16 23:25
 * @Description:
 */
public class ConcreteAggregate extends  Aggregate {

    public List<Object> items =new LinkedList<>();

    @Override
    public Iterator CreateIterator() {
        return new ConcreteIterator(this);
    }

    public int Count(){
        return items.size();
    }

    public Object get(int index){
            return items.get(index);
    }
}
