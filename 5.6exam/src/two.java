public class two {
    public static void main(String[] args) {
        int a,b,c;
        int[] sum=new int[10];
        for (int num =100;num<1000;num++) {
            a=num/100;
            b=num/10%10;
            c=num%10;
            if ((a*a*a+b*b*b+c*c*c)==num){
                sum[0]=num;
                System.out.println(num);
            }
        }
    }

}
