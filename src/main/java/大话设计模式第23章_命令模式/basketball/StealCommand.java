package 大话设计模式第23章_命令模式.basketball;

/**
 * @Author: fang
 * @Date: 2019/2/20 22:26
 * @Description:
 */
public class StealCommand implements  Command {
    @Override
    public void execute() {
        System.out.println("抢断");
    }
}
