package 大话设计模式第27章_解释器模式.a01概念;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: fang
 * @Date: 2019/2/24 15:19
 * @Description:
 */
public class TestMain {
    public static void main(String[] args) {

        Context context = new Context();
        List<AbstractExpression> list =new ArrayList<>();
        list.add(new TerminalExpression());
        list.add(new NonterminalExpression());
        list.add(new TerminalExpression());
        list.add(new NonterminalExpression());

        for(AbstractExpression expression : list){
                     expression.interpret(context);
        }


    }
}
