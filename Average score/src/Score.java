import java.util.Scanner;
/*循环的使用，动态输入学生人数，先输入人数*/
public class Score {

        public static void main(String[] args) {
            double grade=0;
            double averageGrade=0;
           // final int SIZE = 5;//声明常量
            int SIZE=0;
            Scanner sc = new Scanner(System.in);// sc自定义名称，仅创建一次对象
            System.out.println("输入学生人数");
            SIZE=sc.nextInt();
            System.out.println("输入学生成绩");
            for(int i=0;i<SIZE;i++){

                grade=sc.nextDouble();//多个方法
                averageGrade = averageGrade + grade;
            }
            averageGrade = averageGrade/SIZE;


            System.out.println("平均成绩"+averageGrade);


        }
    }

