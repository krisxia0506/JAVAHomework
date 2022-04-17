import java.io.IOException;

/*定义桌子类TableInfo，属性有腿数（int legs）和高度（double height），
为桌子类添加相应的构造方法和显示桌子信息的display()方法。以TableInfo类为父类，
继承得到方桌类（RectTable）和圆桌类（RoundTable），方桌类新增属性长（double length）和宽（double width），
圆桌类新增属性半径（double radius）。设计测试类，分别创建方桌类和圆桌类的对象，输出对应的桌子信息。*/
public class two {
    public static void main(String[]args) {
        //方桌的腿数是4，高1.2，长1.6，宽0.8
        RectTable rt = new RectTable(4,1.2,1.6,0.8);
        rt.display();
        //圆桌的腿数是3，高0.5，半径是0.4
        RoundTable round = new RoundTable(3,0.5,0.4);
        round.display();
        round.displayRound();
    }

}
class TableInfo{
    private int legs;
    private double height;


    public TableInfo(int legs, double height) {
        this.legs = legs;
        this.height = height;
    }

    public void display(){
        System.out.println("legs:"+legs);
        System.out.println("height:"+height);
    }
}
class RectTable extends TableInfo{
    private double length;
    private double width;

    public RectTable(int legs,double height,double length,double width){
        super(legs,height);

    }


}
class RoundTable extends TableInfo{
    private double radius;

    public RoundTable(int legs,double height,double radius) {
        super(legs,height);
        this.radius = radius;
    }
    public void displayRound(){
        System.out.println("radius:"+radius);
    }
}