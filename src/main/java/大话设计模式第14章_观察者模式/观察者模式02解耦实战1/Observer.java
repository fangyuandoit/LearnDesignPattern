package 大话设计模式第14章_观察者模式.观察者模式02解耦实战1;

import lombok.Data;
import 大话设计模式第14章_观察者模式.观察者模式01双向耦合.Secretary;

/**
 * @Author: fang
 * @Date: 2019/1/16 22:18
 * @Description:
 */
@Data
public abstract class Observer {

    private String name;
    private Secretary secretary;

    public abstract  void update();

}
