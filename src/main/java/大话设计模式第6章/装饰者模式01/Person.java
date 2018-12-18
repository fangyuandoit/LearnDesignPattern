package 大话设计模式第6章.装饰者模式01;

public   class Person {

    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public  void show(){
        System.out.println("装扮的"+name);
    }
}
