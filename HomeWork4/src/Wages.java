import java.util.Arrays;
import java.util.Scanner;
import static java.lang.Integer.*;
public class Wages {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int num=1;//第几个人的工资最大,从第一个人开始
            int [] a = new int[6];//10个数组元素
            int [] b = new int[6];//创建一个数组b用作寻找最大值得下标
            for(int i = 0;i<6;i++){
                a[i] = sc.nextInt();
          //使用nextInt()方法时，，它的返回值是int类型的，将空格看作是两个输入的数据的间隔
            }
            for(int i = 0;i<6;i++){
                b[i] = a[i];    //复制一份数组a给数组b，保护一下
            }
            Arrays.sort(a); //对数组a进行排序，此时a[5]最大

            for(int i =0;i<6;i++){
                if(a[5]==b[i]){//找出数组b中与排序后的最大值a[5]相等的b[i]
                    num=i+1;//i+1赋值给num，得出第几个人的工资最大
                }
            }
            System.out.println("No "+num+" salary maxsalary:"+a[5]);
        }
}
