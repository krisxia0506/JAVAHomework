/*定义接口Movable，接口中包含抽象方法move()。定义接口Soundable，接口中包含方法sound()。
定义Person类的子类Teacher类和Worker类实现Movable接口和Soundable接口。在测试类Main中，
创建Teacher类和Worker类的实例，输出相应的信息。*/
package two;
public class two {
    public static void main(String[] args) {

        Teacher t1=new Teacher();

        Worker w1=new Worker();

        t1.move();

        w1.move();

        t1.sound();

        w1.sound();

    }
}

interface Movable{
     void move();

}

interface Soundable{
    void sound();
}

class Person {

}
class Teacher extends Person implements Movable,Soundable{

    @Override
    public void move() {
        System.out.println("Mr. Wang walks on the platform!");
    }

    @Override
    public void sound() {
        System.out.println("Mr. Wang is in class!");

    }
}

class Worker extends Person implements Movable,Soundable{

    @Override
    public void move() {
        System.out.println("Zhang Gong walks around the workshop!");
    }

    @Override
    public void sound() {
        System.out.println("The noise is too loud to hear clearly.");

    }
}
