package helloOop;

public class Shape {
    
    
    public void getArea(){
        
    }
    public static void main(String[] args) {
        rectangle r1 =new rectangle();
        r1.height=8;
        r1.width=5;
        r1.getArea();

        triangle t1 = new triangle();
        t1.height=6;
        t1.base=5;
        t1.getArea();

        circle c1 = new circle();
        c1.r=4;
        c1.getArea();
    }
}
