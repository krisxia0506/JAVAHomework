import java.util.Scanner;
//组句游戏，输入几个次来组句
public class MakeSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input your favorite color, food, animal and the best friend line by line:");
        String color = sc.nextLine();
        String food = sc.nextLine();
        String animal = sc.nextLine();
        String name = sc.nextLine();
        System.out.println("I had a dream that "+name+" ate a "+color+" "+animal+" and said that it tasted like "+food+"!");

    }
}
