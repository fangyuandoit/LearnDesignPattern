package 大话设计模式第9章.原型模式.画笔;

//这是Product接口的实现类, 下划线类.
//
//向特定的下划线类传入一个字符串后, 他会打印出该字符串和下划线
public class UnderLinePen implements   Product {

    /**
     * 下划线
     */
    private char underline;


    public UnderLinePen(char underline) {
        this.underline = underline;
    }

    @Override
    public void use(String str) {
        System.out.println("\"" + str + "\"");
        System.out.print(" ");
        for (int i = 0; i < str.getBytes().length; i++) {
            System.out.print(underline);
        }
        System.out.println("");

    }

    @Override
    public Product createClone() {
        try {
            return (Product) this.clone();

        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
