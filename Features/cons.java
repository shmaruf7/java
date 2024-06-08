package Features;

public class cons {
    String name;
    int num;
    int id;//last 4 digit
    cons (String name, int num, int id){
        this.name=name;
        this.num=num;
        this.id=id;

    }
    void display(){
        System.err.println("Name:"+name);
        System.err.println("Number:"+num);
        System.err.println("ID:"+id);
    }

}
