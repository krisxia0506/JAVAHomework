import java.util.Scanner;

class Rect {
    //类的属性
    double side1;
    double side2;

    //方法
    public static double getArea(double x,double y) {  //计算矩形的面积
        double area;  //定义面积变量
        area = x * y;
        return area;  //返回面积

    }

    public static double getPerimeter(double x,double y) {  //计算矩形的周长
        double per;  //定义周长变量
        per = (x + y) * 2;
        return per;  //返回周长
    }
    public double getArea(){  //计算矩形的面积
        double area;  //定义面积变量
        area = side1*side2;
        return area;  //返回面积

    }
    public double getPerimeter(){  //计算矩形的周长
        double per;  //定义周长变量
        per = (side1+side2) * 2;
        return per;  //返回周长
    }

}
public class one {
    public static void main(String args)
    {
        Scanner sin =new Scanner(System.in);
        Rect r = new Rect();
        r.side1 = sin.nextDouble();
        r.side2 = sin.nextDouble();

        System.out.println("area is:"+r.getArea());
        System.out.println("perimeter is:"+r.getPerimeter());
        System.out.println(Rect.getArea(3, 5));
        System.out.println(Rect.getPerimeter(3, 5));
    }
}
