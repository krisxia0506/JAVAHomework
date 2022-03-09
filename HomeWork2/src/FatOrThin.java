import java.util.Scanner;
/*输入身高和体重，计算BMI和判断胖瘦*/
public class FatOrThin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your height(m): ");
        double height = sc.nextDouble();
        System.out.print("Enter your weight(kg): ");
        double weight = sc.nextDouble();
        double BMI=weight/(height*height);
        BMI = (double) Math.round(BMI * 10) / 10;//四舍五入保留一位小数
        System.out.println("Your BMI is "+BMI);
        if(BMI<18.5){
            System.out.println("You are Underweight.");
        }else if(BMI>=18.5&&BMI<24){
            System.out.println("You are Normal weight.");
        }else if(BMI>=24&&BMI<27){
            System.out.println("You are Overweight.");
        }else{
            System.out.println("You are Obese.");
        }
    }
}
