package 大话设计模式第27章_解释器模式.a01概念;

/**
 * @Author: fang
 * @Date: 2019/2/24 15:15
 * @Description: 抽象的解释操作，这个接口为抽象语法树中所有的节点所共享
 */
public abstract class AbstractExpression {

    public  abstract  void  interpret(Context context);

}
