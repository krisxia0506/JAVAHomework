import java.util.Scanner;

class TableInfo{
    private String shape;
    private int height;
    private Worker owner;

    public TableInfo(String shape, int height) {
        this.shape = shape;
        this.height = height;
    }
    //用置取方法设置table对象的owner
    public void setOwner(Worker owner) {
        this.owner = owner;
    }
    //返回shape属性
    public String display(){

        return shape;
    }
    //输出
    public void print(){
        System.out.println("This is "+ owner.display() +"'s table");
    }
}

class Worker{
    private String name;
    private TableInfo table;
    //输出
    public void print(){
        System.out.println(name+" has a "+table.display()+" table");
    }
    //返回name属性
    public String display(){

        return name;
    }
    //构造方法
    public Worker(String name, TableInfo table) {
        this.name = name;
        this.table = table;
        this.table.setOwner(this);
    }
}
public class two {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in) ;
        System.out.println("please input table's shape:");
        String shape = sc.next();
        TableInfo table= new TableInfo(shape,80) ;
        System.out.println("please input worker's name:");
        String name = sc.next();
        Worker worker = new Worker(name ,table) ;
        table.print();
        System.out.println("-----") ;
        worker.print();

    }
}
