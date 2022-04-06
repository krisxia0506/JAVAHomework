/*定义Function类，该类中包含4个重载的f()方法，分别计算各个分段情况的值。
定义测试类，在main方法中实现x，ｙ，ｚ值 的输入、条件的判断及结果的输出 。
main方法的写法如下，注意，不要修改main的代码，否则会扣分：*/
import java.util.Scanner;
class Function{
    public int f(){
        return 0;
    }
    public int f(int x){
        return x*x;
    }
    public int f(int x,int y){
        return x*x+y*y;
    }
    public int f(int x,int y,int z){
        return x*x+y*y+z*z;
    }
}
public class two {
    public static void main(String [] args){
        int x,y,z;
        Scanner in =new Scanner(System.in);
        x=in.nextInt();
        y=in.nextInt();
        z=in.nextInt();
        in.close();
        Function function=new Function();
        int result;
        if(x<0){
            result=function.f();
        }
        else if(x>=0 && y<0){
            result=function.f(x);
        }
        else if(x>=0 && y>=0 && z<0){
            result=function.f(x,y);
        }
        else{
            result = function.f(x,y,z);
        }

        System.out.println(result);

    }
}
