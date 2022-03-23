import java.util.Scanner;
//在n，m之间找素数
public class one {
    public static void printPrime(int n, int m){
        for(int i=n;i<=m;i++){
            boolean prime = true;
            for (int j =2;j<i;j++){
                if(i%j==0){
                    prime = false;
                    break;
                }
            }
            if(prime){
                System.out.println(i);
            }
        }

    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int m = in.nextInt();

        printPrime(n, m);

    }
}
