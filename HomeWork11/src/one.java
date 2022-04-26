/*以Person类（包含姓名和年龄属性，相应的构造方法和置取方法，
定义显示信息的display()方法）为父类，继承得到子类Worker。
Worker类具有自己的属性工资和级别属性，并在构造方法中调用Person类的构造方法。
设计测试类创建Worker类对象，输出相应的信息。*/
public class one {
    public static void main(String[] args) {
    Worker w = new Worker();
    Worker w2 = new Worker("Tom",25);//9000是工资，Middle是级别
    Worker w3 = new Worker( "Jerry",26,9000, "Middle");
    w2.display();
}
}
class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person() {
    }
    public void display(){
        System.out.println("name=" +name);
        System.out.println("age=" +age);
    }
}
//Worker继承父类Person
class Worker extends Person{
   private int salary;
   private String level;

    //继承Person两个参的构造方法
    public Worker(String name, int age) {
        super(name, age);
    }
    //继承Person无参的构造方法
    public Worker() {
        //super(); 隐含的，因为要让子类对象也有父类的属性
    }

    public Worker(int salary, String level) {
        //super(); 隐含的
        this.salary = salary;
        this.level = level;
    }

    public Worker(String name, int age, int salary, String level) {
        //这个就不隐含super()了因为已经用了 super(name, age)
        super(name, age);
        this.salary=salary;
        this.level=level;
    }

}

