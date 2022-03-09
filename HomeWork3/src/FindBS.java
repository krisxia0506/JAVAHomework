import java.util.Scanner;
/*输入有几个数据，输入数据，找最大值最小值*/
public class FindBS {
    public static void main(String[] args) {
        int num=0;//数据个数
        int largest=0;
        int smallest =0;
        Scanner sc= new Scanner(System.in);
        num = sc.nextInt();
        int[] a = new int[num];/*开辟了一个长度为num的数组*/
        for(int i =0;i<num;i++){
            a[i]= sc.nextInt();
        }
        largest=a[0];
        smallest=a[0];
        for (int i=0;i<num;i++){
            if(a[i]>largest){
                largest=a[i];
            }
            else if(a[i]<smallest){
                smallest=a[i];
            }
        }
        System.out.println(largest+" "+smallest);
    }
}
