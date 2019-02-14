package 大话设计模式第18章_备忘录模式.a01理论;

import lombok.Data;

/**
 * @Author: fang
 * @Date: 2019/2/14 22:21
 * @Description: 备忘录类
 */
@Data
public class Memento {
    private String state;


    //构造方法，将相关数据导入
    public Memento(String state){
        this.state =state;
    }


}
