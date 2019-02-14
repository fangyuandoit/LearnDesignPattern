package 大话设计模式第18章_备忘录模式.a01理论;

import lombok.Data;

/**
 * @Author: fang
 * @Date: 2019/2/14 22:15
 * @Description:  发起人类
 */
@Data
public class Originator {

    //需要保存的属性
    private String state;

    //创建备忘录，将当前需要保存的信息导入并实例化一个memento对象
    public Memento CreateMemento(){
        return (new Memento(state));
    }

    //恢复备忘录，将memento导入并将相关数据恢复
    public void SetMemento(Memento memento){
        state  = memento.getState();
    }

    //显示数据
    public void Show(){
        System.out.println("State="+state);
    }

}
