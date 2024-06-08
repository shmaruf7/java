package assignment;

public class main {
    public static void main(String[] args) {
        Item item1 = new Item("Chips", 8, 10);
        item1.setVendor("Pran");
        System.out.println("Item name: "+item1.getName());
        System.out.println("Cost: "+item1.getCost());
        System.out.println("Price: "+item1.getPrice());
        System.out.println("Taxable: "+item1.getTaxable());
        System.out.println("Vendor name: "+item1.getVendor());
        System.out.println("Pofit: "+item1.profit());
        System.out.println("Weight:  "+item1.getWight());
       
    }
}
