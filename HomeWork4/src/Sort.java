import java.util.Scanner;
import java.util.Arrays;
//数组排序
public class Sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] a = new int[10];//10个数组元素
        for(int i =0;i<10;i++){
            a[i]=sc.nextInt();
        }

        Arrays.sort(a);

        //以逗号分隔输出
        System.out.print(a[0]);
        for (int i =1;i<10;i++){
            System.out.print(","+a[i]);
        }
    }
}
