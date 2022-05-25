import java.sql.*;

public class two {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/javadb";
        String username = "root";
        String password = "2547359996";
        Connection conn = DriverManager.getConnection(url, username, password);
        System.out.println("连接成功");
        String zj = "insert into student(name,age,grade) values('夏佳怡',33,77)";
        String xg = "update student set grade = 88 where name ='Tom'";
        String sc = "delete from student where name ='Tom'";
        String xs = "select * from student where name ='夏佳怡'";
        //创建语句集对象
        Statement stmt = conn.createStatement();
        if(stmt.executeUpdate(zj)>=1){
            System.out.println("插入成功");
        }
        if(stmt.executeUpdate(xg)>=1){
            System.out.println("修改成功");

        }
        if(stmt.executeUpdate(sc)>=1){
            System.out.println("删除成功");
        }
        //输出
        ResultSet rs = stmt.executeQuery(xs);
        while(rs.next()){
            // 通过字段检索
            int id  = rs.getInt("id");
            String name = rs.getString("name");
            int age = rs.getInt("age");
            int grade = rs.getInt("age");

            // 输出数据
            System.out.println("ID: "+id);
            System.out.println("姓名: "+name);
            System.out.println("年龄: "+age);
            System.out.println("成绩: "+grade);
        }
        rs.close();
        stmt.close();
        conn.close();


    }


}

