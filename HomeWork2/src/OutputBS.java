import java.util.Scanner;
/*输入两个数，按大小顺序输出*/
public class OutputBS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(b>a){      //如果b>a，则交换
            System.out.println(b+">"+a);
        }else {
            System.out.println(a + ">" + b);
        }
    }
}
