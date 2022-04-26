package four;
import java.util.Arrays;
/*要求编程实现Student类，使给定的Test类能正常运行，并实现按长度顺序输出姓名。*/
public class four {
    public static void main(String[] args)
    {
        Student[] s = new Student[4];
        s[0] = new Student("May");
        s[1] = new Student("Jack");
        s[2] = new Student("Armstrong");
        s[3] = new Student("Linda");

        Arrays.sort(s);

        System.out.println("according to length order:");
        for (Student stu:s)
        {
            System.out.println(stu.getName());
        }
    }
}

class Student implements Comparable<Student>{
    private String name;

    public Student(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int compareTo(Student student) {

        if(this.name.length()>student.name.length()){

            return 1;

        }else if(this.name.length()<student.name.length()){

            return -1;

        }else

            return 0;

    }

}



