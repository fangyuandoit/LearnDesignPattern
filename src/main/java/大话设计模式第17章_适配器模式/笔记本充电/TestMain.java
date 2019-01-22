package 大话设计模式第17章_适配器模式.笔记本充电;

/**
 * @Author: fang
 * @Date: 2019/1/22 23:00
 * @Description:
 */
public class TestMain {

    public static void main(String[] args) {

        ThreePlugIf threePlugIf =new TwoPlugAdapter();
        NoteBook noteBook =new NoteBook(threePlugIf);
        noteBook.charge();

    }
}
