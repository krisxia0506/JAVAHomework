import java.util.Scanner;
public class StudentInfo {
    /**
     *
     * @param args:
     */
    public static void main(String[] args) {
        String result="PASS";
       Scanner sc = new Scanner(System.in);// sc自定义名称，仅创建一次对象

        System.out.println("输入学生姓名");
        String name=sc.nextLine();//多个方法
        System.out.println("输入学生年龄");
        int age=sc.nextInt();
        System.out.println("输入学生成绩");

        double grade = sc.nextDouble();
        if (grade<60){
            result="No PASS";
        } else if(grade>=60&&grade<75){
            result="合格";
        } else if(grade>=75&&grade<90){
            result="良好";
        } else if(grade>=90){
            result="优秀";
        }
        System.out.println("姓名："+name);
        System.out.println("年龄："+age);
        System.out.println("成绩："+grade);
        System.out.println(result);
//111111111111111111111111111

    }
}
