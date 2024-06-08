package assignment;

public class Circle extends Shape {
 double r;
 static double pi=3.1416;
 @Override
 double getArea(){
    return pi*r*r;
 }   
}
