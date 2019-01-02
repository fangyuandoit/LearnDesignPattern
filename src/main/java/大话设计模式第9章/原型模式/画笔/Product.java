package 大话设计模式第9章.原型模式.画笔;

public interface Product extends   Cloneable {

    void use(String str);

    Product createClone();


}
