package 大话设计模式第24章_责任链模式.dealnumber;

/**
 * @Author: fang
 * @Date: 2019/2/21 21:20
 * @Description:
 */
public  abstract  class Handler {
    protected  Handler successor; //处理对象

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract  void handleRequest(int request);
}
