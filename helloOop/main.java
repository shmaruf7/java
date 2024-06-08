package helloOop;

public class main extends Car {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setCompany_name("Company name: Toyota");
        c1.setModel_name("Model: Toyota Camry");
        c1.setYear(2023);
        System.err.println(c1.getCompany_name());
        System.err.println(c1.getModel_name());
        System.err.println("Year:"+c1.getYear());
        System.err.println("Mileage:"+c1.getMileage()+" KM");


    }
    
}
