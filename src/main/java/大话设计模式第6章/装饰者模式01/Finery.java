package 大话设计模式第6章.装饰者模式01;


/**
 * 服饰类
 */
public class Finery extends  Person {

    protected  Person person;


    /**
     * 打扮
     */
    public void Decorate(Person person){
        this.person = person;
    }

    @Override
    public void show() {
                if(person!=null){
                    person.show();
                }
    }

}
