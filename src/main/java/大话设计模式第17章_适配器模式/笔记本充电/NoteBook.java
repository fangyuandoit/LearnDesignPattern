package 大话设计模式第17章_适配器模式.笔记本充电;

/**
 * @Author: fang
 * @Date: 2019/1/22 22:58
 * @Description:
 */
public class NoteBook {

    private ThreePlugIf plug;
    public NoteBook(ThreePlugIf plug){
        this.plug=plug;
    }
    //充电
    public void charge(){
        plug.powerWithThree();
    }
}
