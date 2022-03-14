import java.util.Scanner;
/*计算C(n,m)的值，C(n,m)=n！/(m！*（n-m）！)

从键盘输入n和m的值，输入提示为：“please input n and m value(n>=m)”
在类中定义两个方法：main主方法和计算某个数阶乘的方法。在main方法中调用计算阶乘的方法实现程序功能，若只定义main方法给0分！
main方法的代码如下：不要修改main方法的代码，否则会扣分：*/
public class Cnm {
    public static void main(String[] args) {

        System.out.println("please input n and m value(n>=m)");

        Scanner in = new Scanner(System.in);

        int n = in.nextInt(),m = in.nextInt();

        System.out.println(jc(n)/(jc(m)*jc(n-m)));

    }
    public static int jc (int a){
        int temp=1;
        for (int i=1;i<=a;i++){
            temp=temp*i;
        }
        return temp;
    }
}
