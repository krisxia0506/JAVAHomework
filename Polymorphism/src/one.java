public class one {
    public static void main(String[] args)
    {
        Person[] people = new Person[5];
        people[0] = new Person("Tom");
        people[1] = new Teacher("Kevin","professor");
        people[2] = new Student("Jerry",21);
        people[3] = new Undergraduate("John",22,3);
        people[4] = new Graduate("Mary",23,"computer");

        for (Person p: people)
        {
            p.display();
            System.out.println(">>>");
        }
    }
}

class Person{
    private String name;
    public void display(){
        System.out.println("Name: "+name);
    }

    public Person(String name) {
        this.name = name;
    }
}
class Teacher extends Person{
    private String professionalTitle;
    public void display(){
        super.display();
        System.out.println("Professional Title: "+professionalTitle);
    }

    public Teacher(String name, String professionalTitle) {
        super(name);
        this.professionalTitle = professionalTitle;
    }
}

class Student extends Person {
    private int studentNumber;

    public Student(String name, int studentNumber) {
        super(name);
        this.studentNumber = studentNumber;
    }

    public void display() {
        super.display();
        System.out.println("StudeneNumber: " + studentNumber);
    }

}
class Graduate extends Student{
    private String major;

    public Graduate(String name, int studentNumber, String major) {
        super(name, studentNumber);
        this.major = major;
    }

    public void display() {
        super.display();
        System.out.println("Major: " + major);
    }
}
class Undergraduate extends Student{
    private int grade;

    public Undergraduate(String name, int studentNumber, int grade) {
        super(name, studentNumber);
        this.grade = grade;
    }
    public void display() {
        super.display();
        System.out.println("Grade: " + grade);
    }
}