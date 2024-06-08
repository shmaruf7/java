package Lab;

public class Boy extends male {
    String profesion;
    @Override
    void display(){
        super.display();
        System.out.println("Profession: "+profesion);
    }
}
