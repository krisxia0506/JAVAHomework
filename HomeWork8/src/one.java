/*【输入形式】

两组整数值，一组表示点坐标，一组是矩形的两个边长
【输出形式】

矩形的位置和边长信息
【样例输入】

3 4

10 20
【样例输出】

[x=3,y=4]

side1=10,side2=20*/
import java.util.Scanner;
class MyPoint{
    private int x;
    private int y;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void print(){
        System.out.println("[x="+x+",y="+y+"]");
    }
}
class MyRect{
    private int side1;
    private int side2;
    private MyPoint location;

    public MyRect(int side1, int side2, MyPoint location) {
        this.side1 = side1;
        this.side2 = side2;
        this.location = location;
    }
    public void print(){
        location.print();
        System.out.println("side1="+side1+",side2="+side2);

    }
}
public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out. println( "please input x and y:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        MyPoint point =new MyPoint( x,y );
        System.out.println( "please input side1 and side2:");int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        MyRect rect = new MyRect(side1,side2,point);
        rect.print();

    }
}
