package assignment;


public class Item {
   
    private String name;
    private String vendor;
    private double price;
    private double cost;
    
    static private double weight=1;
    static private boolean taxable=true;
    
    Item(String n, double c, double p){
        name=n;
        cost =c;
        price=p;
    }
    void setVendor(String v){
        vendor=v;
    }
    
    public String getName(){
        return name;
    }
    public String getVendor(){
        return vendor;
    }

    public double getCost(){
        return cost;
    }
    public double getPrice(){
        return price;
    }
    public double getWight(){
        return weight;
    }
    public boolean getTaxable(){
        return taxable;
    }

    void increaseCost(){
        this.cost *=1.05;
    }
    double profit(){
        return price-cost;
    }

}
