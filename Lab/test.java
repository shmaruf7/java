package Lab;

public class test {
    public static void main(String[] args){
        Car car1= new Car();
        car1.setCompany_name("TaTa");
        car1.setModel_name("Tata Nano");
        car1.setYear(2019);
        System.out.println("Car Company: "+car1.getCompany_name());
        System.out.println("Car Model: "+car1.getModel_name());
        System.out.println("Car Release year: "+car1.getYear());
        System.out.println("Car Mileage: "+car1.getMileage());
    }
}
