public class Worker {
    private String Name;
    private int Age;
    private double Salary;
    private String Level;
    //空构造方法
    public  Worker(){}
    //3形参构造方法
    public Worker(String Name,int Age,double Salary,String Level){
        this.Name = Name;
        this.Age = Age;
        this.Salary = Salary;
        this.Level = Level;
    }
    //置取方法

    //name
    public String getName() {
        return Name;
    }

    public void getName(String name) {
        Name = name;
    }

    //age
    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        if(age<0){
            System.out.println("请输入正确年龄");
            return;
        }
        Age = age;
    }

    //salary
    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    //level
    public String getLevel() {
        return Level;
    }

    public void setLevel(String level) {
        Level = level;
    }

    //display方法
    public void display(){
        System.out.println("name="+Name);
        System.out.println("age="+Age);
        System.out.println("salary="+Salary);
        System.out.println("level="+Level);
    }
}
