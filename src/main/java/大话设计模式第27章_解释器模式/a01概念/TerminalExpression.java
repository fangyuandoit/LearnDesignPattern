package 大话设计模式第27章_解释器模式.a01概念;

import 大话设计模式第22章_桥接模式.a01概念.Abstraction;

/**
 * @Author: fang
 * @Date: 2019/2/24 15:17
 * @Description:  终结符表达式
 */
public class TerminalExpression  extends AbstractExpression {
    @Override
    public void interpret(Context context) {
        System.out.println("终端解释器");
    }


}
