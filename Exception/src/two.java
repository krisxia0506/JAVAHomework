/*【问题描述】所谓绝对素数是指具有如下性质的素数：一个素数，当它的各位数字逆序排列，形成的整数仍为素数，
这样的数称为绝对素数。例如，11，79，389是素数，其各位数字对换位置后分别为11，97，983仍为素数，
因此这三个素数均为绝对素数。编写方法public static int absolute(int x)，判断一个整数是否为绝对素数，
如果x是绝对素数则返回1，否则返回0。编写程序Main类，在main主方法中，接收控制台输入的两个整数a，b。
调用absolute函数输出所有a到b之间（包括a和b）的全部绝对素数*/

import java.util.Scanner;

public class two {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a; i <= b; i++) {
            if (absolute(i) == 1 && absolute(reverse(i)) == 1) {
                System.out.println(i);
            }
        }
    }

    public static int absolute(int x) {//判断素数
        if (x == 1) {
            return 0;
        }
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    public static int reverse(int x) {//逆序
        int ret = 0;
        while (x != 0) {
            int last = x % 10;
            ret = ret * 10 + last;
            x /= 10;

        }
        return ret;
    }
}
