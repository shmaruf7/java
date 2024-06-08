package Lab;

public class male extends Human{
    double height;
    @Override
    void display(){
        super.display();
        System.out.println("Height: "+height+"Feet");
    }
}
