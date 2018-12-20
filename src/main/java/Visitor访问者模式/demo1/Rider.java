package Visitor访问者模式.demo1;

public class Rider implements  Soldier {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    public String getRider(){
        return "Rider";
    }
}
