public class Student {
    //1.属性
    String name ;
    int age = 23;
    double grade = 55.5;
    //2.方法

    public void display() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Student s = new Student();

        s.name="asd";
        s.display();
    }
}
