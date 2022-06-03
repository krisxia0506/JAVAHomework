import java.io.*;

public class one {
    public static void main(String[] args) throws IOException {
        File file = new File("202007024220夏佳怡.txt");
        FileOutputStream a = new FileOutputStream(file);
        String str ="富强、民主、文明、和谐；自由、平等、公正、法治；爱国、敬业、诚信、友善";
        byte []m = str.getBytes();
        a.write(m);
        a.close();
        System.out.println("写入结束");
        FileReader b = new FileReader(file);
        char[] c = new char[str.length()];
        b.read(c);//把文件读入数组c
        for (char x : c){
            System.out.print(x);

        }
        b.close();
        System.out.println("\n读出结束");



    }
}
