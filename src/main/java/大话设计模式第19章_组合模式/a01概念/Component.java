package 大话设计模式第19章_组合模式.a01概念;

import lombok.Data;

/**
 * @Author: fang
 * @Date: 2019/2/15 21:38
 * @Description: 为组合的对象声明接口
 */
@Data
public abstract class Component {

      String name;
      public  Component(String name ){
            this.name =name;
      }


      //通常都用add  remove 方法来提供增加或者移除树叶或树枝的功能
      public abstract  void Add(Component c);
      public abstract  void  Remove(Component c);
      public abstract  void Display(int depth);


}
