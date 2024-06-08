package Lab;

public class Female extends Human{
    double weight;
    @Override
    void display(){
        super.display();
        System.out.println("Weight: "+weight+"kg");
    }    
}
