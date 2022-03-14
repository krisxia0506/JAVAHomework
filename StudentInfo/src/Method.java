import java.util.Scanner;


//此代码练习，java的方法的提取


public class Method {
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
        }
        //void表示方法没有返回值
        public static void shuchu (String name,int age,double grade,String result){
            System.out.println("姓名："+name);
            System.out.println("年龄："+age);
            System.out.println("成绩："+grade);
            System.out.println(result);
        }
//1111111111111111111111
    public static String judge (double grade) {
        String result="";
        if (grade<60){
            result="No PASS";
        } else if(grade>=60&&grade<75){
            result="合格";
        } else if(grade>=75&&grade<90){
            result="良好";
        } else if(grade>=90){
            result="优秀";
        }
        return result;
    }


}
