package 大话设计模式第23章_命令模式.basketball;

/**
 * @Author: fang
 * @Date: 2019/2/20 22:26
 * @Description:
 */
public class NbaGameHandler {

    private Command[] commands = new Command[4];

    public void setA(Command command) {
        commands[0] = command;
    }
    public void setB(Command command) {
        commands[1] = command;
    }
    public void setC(Command command) {
        commands[2] = command;
    }
    public void setD(Command command) {
        commands[3] = command;
    }

    public void pushA(){
        commands[0].execute();
    }
    public void pushB(){
        commands[1].execute();
    }
    public void pushC(){
        commands[2].execute();
    }
    public void pushD(){
        commands[3].execute();
    }




}
