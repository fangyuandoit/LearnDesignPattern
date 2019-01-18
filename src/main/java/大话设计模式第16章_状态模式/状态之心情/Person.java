package 大话设计模式第16章_状态模式.状态之心情;

import lombok.Data;
import lombok.Getter;

/**
 * @Author: fang
 * @Date: 2019/1/18 23:02
 * @Description:
 */
@Data
public class Person {

    private Mood mood;


    public void perform(){
        mood.perform();
    }

}
