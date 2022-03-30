import java.util.Scanner;
public class prime {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int m = in.nextInt();

        printPrime(n, m);

    }
    public static void printPrime(int n, int m){

        for(int i=n;i<=m;i++){
            boolean isprime = true;
            for (int j =2;j<i;j++){
                if(i%j==0){
                    isprime = false;
                    break;
                }
            }
            if(isprime){
                System.out.println(i);
            }
        }

    }
}
