package Lab;

public class Girl extends Female {
    String Occupation;
    @Override
    void display(){
        super.display();
        System.out.println("Occupation: "+Occupation);
    }
}
