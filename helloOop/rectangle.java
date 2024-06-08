package helloOop;

public class rectangle extends Shape {
    int height;
    int width;
    
    @Override
    public void getArea(){
        System.out.println("The area of rectengle is:"+height*width+" square unit");
    }
}
