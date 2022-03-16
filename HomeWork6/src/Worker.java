public class Worker {
    String name = "Worker Zhang";
    int age = 28;
    double salary = 8888.0;
    String level  = "SeniorEngineer";

    public void display(){
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        System.out.println("salary:"+salary);
        System.out.println("level:"+level);
    }
    public static void main(String[] args) {
        Worker Zhang = new Worker();
        Zhang.display();
    }
}
