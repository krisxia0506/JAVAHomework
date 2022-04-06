/*定义Worker类，为该类添加计算工人年收入的重载方法。计算年收入有两个方法，
第一个方法是保底工资+年工时*单价；第二种方法是固定月工资*12.
定义测试类，在main方法中分别使用两种方法计算工人的年收入。*/
import java.util.Scanner;
class Worker {
    String name = "Worker Zhang";
    int age = 28;
    double salary = 8888.0;
    String level = "SeniorEngineer";

    public int way(int x,int y,int z) {

        return x+y*z;

    }
    public int way(int x) {

        return x*12;

    }
}
public class one {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int baodi = sc.nextInt();
        int gongshi = sc.nextInt();
        int danjia = sc.nextInt();
        int guding = sc.nextInt();
        Worker worker = new Worker();
        System.out.println("way1:" + worker.way(baodi, gongshi, danjia));
        System.out.println("way2:" + worker.way(guding));
    }
}
