import org.jetbrains.annotations.NotNull;

public class Student2 {
    //1.属性
    public String name ;
    private int age ;
    private double grade ;
   //构造方法,和类名相同
    public Student2(String n,int a,double g){
        this.name = n;
        this.age = a;
        this.grade = g;
    }
    //2.方法
    public void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(grade);
    }
    public void setName(String name){//name属性的设置方法
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public boolean com(Student2 s){
        return s.age>this.age;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public static void main(String[] args) {
        Student2 s1 = new Student2("asd1",11,1);
        Student2 s2 = new Student2("asd2",12,1);
        Student2 s3 = new Student2("asd3",13,1);


        s1.display();
        s2.display();
        s3.display();
    }
}
