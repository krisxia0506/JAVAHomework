import java.util.Scanner;

public class Rect {
    //类的属性1
    double side1;
    double side2;
    //方法
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

    public static void main(String[]args) {
        Scanner sin = new Scanner(System.in);
        Rect r =new Rect(); //创建Rect类的对象
        r.side1 = sin.nextDouble();//将对象r的side1属性赋值，赋值内容为你输入的值
        r.side2 =sin.nextDouble();
        System.out. println( "area is:"+r.getArea());
        System.out. println("perimeter is:"+r.getPerimeter());
    }


}
