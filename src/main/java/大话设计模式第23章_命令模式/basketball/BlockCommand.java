package 大话设计模式第23章_命令模式.basketball;

/**
 * @Author: fang
 * @Date: 2019/2/20 22:25
 * @Description:
 */
public class BlockCommand implements  Command {
    @Override
    public void execute() {
        System.out.println("封盖");
    }
}
