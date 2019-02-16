package 大话设计模式第20章_迭代器模式.a01概念;

/**
 * @Author: fang
 * @Date: 2019/2/16 23:21
 * @Description:
 */
public class ConcreteIterator extends  Iterator {

    private ConcreteAggregate aggregate;
    private int current=0;


    public ConcreteIterator(ConcreteAggregate aggregate){
        this.aggregate =aggregate;
    }

    @Override
    public Object First() {
        return aggregate.get(0);
    }

    @Override
    public Object Next() {
        Object ret =null;
        current++;
        if(current<aggregate.Count()){
            ret = aggregate.get(current);
        }
        return ret;
    }

    @Override
    public boolean IsDone() {
        return  current>=aggregate.Count()?true:false;
    }

    @Override
    public Object CurrentItem() {
        return aggregate.get(current);
    }
}
