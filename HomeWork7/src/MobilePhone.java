public class MobilePhone {
//1.属性
    private String Brand;
    private String Num;
    private int Price;
//2.构造方法,一个类中可以有多个构造方法，但每个构造方法的形参数不能相同
    public MobilePhone(String Brand,String Num,int Price){
        this.Brand = Brand;
        this.Num = Num;
        this.Price = Price;
    }

    public MobilePhone(String Brand) {
        this.Brand=Brand;
    }

    public MobilePhone() {
        this("","",0);
    }

    //3.方法
    public void display(){
        System.out.println("brand:"+Brand);
        System.out.println("TelePhoneNum:"+Num);
        System.out.println("price:"+Price);
    }
}
