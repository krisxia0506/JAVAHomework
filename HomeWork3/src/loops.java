import java.util.Scanner;
/*输入几个整数以-1结束，统计奇偶个数*/
public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ji = 0;
        int ou =0;
        int a = sc.nextInt();
        while(a!=-1){
            if(a%2==1){//奇数判断
                ji++;

            }else{
                ou++;
            }
             a = sc.nextInt();
        }
        System.out.print(ji+" "+ou);

    }
}
