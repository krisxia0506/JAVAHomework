import java.util.Scanner;
/*循环的使用，动态输入学生人数，输入中断*/
public class Score2 {

    public static void main(String[] args) {
        double grade=0;
        double averageGrade=0;
        int SIZE=0;
        Scanner sc = new Scanner(System.in);// sc自定义名称，仅创建一次对象
        System.out.println("输入学生成绩");
        grade=sc.nextDouble();//多个方法
        while (grade!=-1){



            averageGrade = averageGrade + grade;
            SIZE++;
            grade=sc.nextDouble();//多个方法
        }
        averageGrade = averageGrade/SIZE;


        System.out.println("平均成绩"+averageGrade);


    }
}

