package assignment;

import helloOop.rectangle;

public class test {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.b=3;
        t1.h=2;
        System.out.println("The area of triangle: "+t1.getArea());

        Rectengular r1 =new Rectengular();
        r1.length=6;
        r1.width=3;
        System.out.println("The area of Rectangle is: "+r1.getArea());

        Circle C1= new Circle();
        C1.r=4;
        System.out.println("The area of Circle is: "+C1.getArea());
    }
}
