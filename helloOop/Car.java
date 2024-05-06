package helloOop;

public class Car {
    private String company_name;
    private String model_name;
    private int year;
    private int mileage=40;

    public void setCompany_name(String a){
        company_name = a;
    }
    public String getCompany_name(){
        return company_name;
    }
    public void setModel_name(String b){
        model_name = b;
    }
    
    public String getModel_name(){
        return model_name;
    }
    public void setYear(int c){
        year = c;
    }
    public int getYear(){
        return year;
    }
    
    public int getMileage(){
        return mileage;
    }
    



}
