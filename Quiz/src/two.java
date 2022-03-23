import java.util.Scanner;
//输入三个数，找中间数
public class two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(b>a&&b<c||b>c&&b<a){
            System.out.println("middle="+b);
        }
        if(a>b&&a<c||a<b&&a>c){
            System.out.println("middle="+a);
        }
        if(c>a&&c<b||c<a&&c>b){
            System.out.println("middle="+c);
        }
    }
}
