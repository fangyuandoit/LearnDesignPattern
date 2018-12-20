package Visitor访问者模式.demo1;

public interface Visitor {

    void visit(Archer archer);
    void visit(Gunner gunner);
    void visit(Rider rider);

}
