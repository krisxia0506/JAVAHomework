package one;

/*定义抽象类Person，类中包含name属性和抽象方法speak()，定义子类Teacher类和子类Worker类，
分别实现抽象方法speak()，分别显示教师说的话和工人说的话。在测试类Main中定义Teacher类和Worker类的上转型对象，
调用speak()方法显示信息。*/

public class one {
    public static void main(String[] args) {

        Person p1 = new Teacher("Mr wang");

        p1.speak();

        p1 = new Worker("Worker zhang");

        p1.speak();

    }
}
abstract class Person{
    String name;

    public Person(String name) {
        this.name = name;
    }

    public abstract void speak();

}

class Teacher extends Person{


    public Teacher(String name) {
        super(name);
    }

    public void speak(){
        System.out.println(name+" said class is over!");
    }

}
class Worker extends Person{
    public Worker(String name) {
        super(name);
    }

    public void speak(){
        System.out.println(name+" said to have a rest!");
    }
}