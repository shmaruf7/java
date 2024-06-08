package helloOop;

public class triangle extends Shape {
    int height;
    int base;
    @Override
    public void getArea(){
        System.out.println("The area of triangle is:"+0.5*base*height+" square unit");
    }
    
}
