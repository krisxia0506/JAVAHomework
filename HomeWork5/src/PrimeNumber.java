import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        StringBuilder out = new StringBuilder(a + "=");//输出
        if(isPrime(a)){
            out.append(a);//如果是素数则输出n=n
        }else {
            while (a!=0){
                for (int j=2;j<=a;j++){
                    if(j==a){//最后一个的特殊情况，不需要加x
                        a=0;//停止寻找
                        out.append(j);
                        break;
                    }
                    if(a%j==0){
                        a=a/j;
                        out.append(j).append('x');
                        break;
                    }

                }
            }

        }
        System.out.println(out);

    }

//判断一下输入的是不是素数
    public static boolean isPrime(int n){
        boolean isPrime = true;
        for(int i =2;i<n;i++){
            if(n%i==0){//如果i能将n除尽则n不是素数
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
