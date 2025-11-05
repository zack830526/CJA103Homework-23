package hw5;

public class MyRectangleMain {

    public static void main(String[] args) {


        MyRectangle w1 = new MyRectangle();
        w1.setWidth(10);
        w1.setDepth(20);
        System.out.println("面積1：" + w1.getArea());

        MyRectangle w2 = new MyRectangle(10, 20);
        System.out.println("面積2：" + w2.getArea());
    }
}
