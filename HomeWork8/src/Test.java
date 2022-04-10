
import java.util.Scanner;
public class Test{

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input table's shape:");
        String shape = sc.next();
        TableInfo table =new TableInfo(shape,80);
        System.out.println("please input worker's name:");
        String name=sc.next();
        Worker woker =new Worker(name,table);
        table.print();
        System.out.println("-----");
        woker.print();

    }
    static class TableInfo{
        private String shape;
        private int height;
        private Worker owner;
        public TableInfo(String shape,int height){
            this.shape=shape;
            this.height=height;
        }
        public Worker getOwner() {
            return owner;
        }
        public void setOwner(Worker owner) {
            this.owner = owner;
        }
        public String getShape() {
            return shape;
        }
        public void setShape(String shape) {
            this.shape = shape;
        }
        public int getHeight() {
            return height;
        }
        public void setHeight(int height) {
            this.height = height;
        }
        public void print(){
            System.out.println("This is "+owner.name+"'s table");
        }

    }
    static class Worker{
        private String name;
        private TableInfo table;
        public Worker(String name,TableInfo table){
            this.name=name;
            this.table=table;
            this.table.setOwner(this);
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public void print(){
            System.out.println(name+" has a "+table.shape+" table");
        }

    }

}

