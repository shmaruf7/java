package Lab;

public class Car {
    private String company_name;
    private String model_name;
    private int year;
    private double mileage=40;

    public void setCompany_name(String cn){
        company_name=cn;
    }
    public String getCompany_name(){
        return company_name;
    }
    public void setModel_name(String mn){
        model_name=mn;

    }
    public String getModel_name(){
        return model_name;
    }
    public void setYear(int y){
        year=y;
    }
    public int getYear(){
        return year;
    }
    public double getMileage(){
        return mileage;
    }
}
