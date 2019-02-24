package 大话设计模式第27章_解释器模式.a01概念;

/**
 * @Author: fang
 * @Date: 2019/2/24 15:17
 * @Description:  终结符表达式
 */
public class NonterminalExpression extends AbstractExpression {
    @Override
    public void interpret(Context context) {
        System.out.println("非终端解释器");
    }


}
