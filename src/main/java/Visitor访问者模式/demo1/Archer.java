package Visitor访问者模式.demo1;

public class Archer implements  Soldier {
    @Override
    public void accept(Visitor v) {
         v.visit(this);
    }

    public String getArcher(){
        return "Archer";
    }
}
