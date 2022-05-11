public class one {
    public static void main(String []args){
        WashMachine wm = new WashMachine(1200, "Haier",8);
        wm.display();
        wm.smart();
    }
}

abstract class Equipment{
    private double price;

    public Equipment(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
   public  abstract void display();

}
interface Smartable{
    void smart();
}
class WashMachine extends Equipment implements Smartable{
    private String brand;
    private int capacity;

    public WashMachine(double price, String brand, int capacity) {
        super(price);
        this.brand = brand;
        this.capacity = capacity;
    }
    public void display(){
        System.out.println("price:"+getPrice());
        System.out.println("brand:"+brand);
        System.out.println("capacity:"+capacity);

    }
    public void smart(){
        System.out.println("The brand's WashMachine is smart");
    }
}