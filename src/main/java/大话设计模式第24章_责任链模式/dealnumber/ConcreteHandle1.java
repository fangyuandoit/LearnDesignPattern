package 大话设计模式第24章_责任链模式.dealnumber;

/**
 * @Author: fang
 * @Date: 2019/2/21 21:25
 * @Description:
 */
public class ConcreteHandle1 extends  Handler {
    @Override
    public void handleRequest(int request) {
           if(request>=0 && request<10){
               System.out.println("handl deal--"+request);
           }else{
               successor.handleRequest(request);//转移到下一位
           }
    }
}
