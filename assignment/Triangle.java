package assignment;

public class Triangle extends Shape {
    float h;
    float b;
    
    @Override
    double getArea() {
        
        super.getArea();
        return 0.5*b*h;
    }

    
    
}
