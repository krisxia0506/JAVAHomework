public class Student2 {
    //1.属性
    String name ;
    int age ;
    double grade ;
   //构造方法,和类名相同
    public Student2(String n,int a,double g){
        name = n;
        age = a;
        grade = g;
    }
    //2.方法
    public void display() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Student2 s1 = new Student2("asd1",1,1);
        Student2 s2 = new Student2("asd2",1,1);
        Student2 s3 = new Student2("asd3",1,1);


        s1.display();
        s2.display();
        s3.display();
    }
}
