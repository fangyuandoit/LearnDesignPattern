package 大话设计模式第24章_责任链模式.dealnumber;

/**
 * @Author: fang
 * @Date: 2019/2/21 21:25
 * @Description:
 */
public class ConcreteHandle2 extends  Handler {
    @Override
    public void handleRequest(int request) {
           if(request>=10 && request<20){
               System.out.println("hand2 deal--"+request);
           }else{
               successor.handleRequest(request);//转移到下一位
           }
    }
}
