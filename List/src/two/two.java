/*设计类Student和类StudentClass，以及学生比较器类StudentComparator。

(1) 类Student有字符串属性name、double属性grade和int属性age

有带参数的构造方法，可设置三个属性的值

有各个属性的置取方法

(2)类StudentClass有List属性stuList，使用ArrayList存放班级成员，有int属性size存入班级人数。

有createClass()方法: 使用下面三个预置数据的数组，为班级添加成员并设置班级人数。

String names[] = {"Tom","Jerry","Snoopy","Mary","Rose"};

              double grades[] = {67,78.5,98,76.5,90};

              int ages[] = {17,18,18,19,17};

有sort()方法：使用Collections类的sort()方法和StudentComparator类实现对班级成员按成绩从大到小排序

有output()方法：实现指定格式的班级成员信息输出

(3)类StudentComparator要实现Comparator接口*/
package two;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class two {
    public static void main(String[] args) {

        StudentClass sClass = new StudentClass();

        sClass.createClass();



        System.out.println("Original Order:");

        System.out.println(sClass.output());



        sClass.sort();



        System.out.println("Sorted Order:");

        System.out.println(sClass.output());

    }
}

class Student {
    private final String name;
    private final double grade;
    private final int age;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.grade = grade;
        this.age = age;
    }

    public String getName() {
        return name;
    }


    public double getGrade() {
        return grade;
    }

}

class StudentClass {
    private int size;
    private final ArrayList<Student> stuList = new ArrayList<>();

    public void createClass() {
        String[] names = {"Tom", "Jerry", "Snoopy", "Mary", "Rose"};

        double[] grades = {67, 78.5, 98, 76.5, 90};

        int[] ages = {17, 18, 18, 19, 17};
        size = names.length;
        for (int i = 0; i < size; i++) {
            stuList.add(new Student(names[i], ages[i], grades[i]));

        }
    }

    public void sort() {
        StudentComparator a = new StudentComparator();
        Collections.sort(stuList,a);

    }

    public String output() {
        StringBuilder a = new StringBuilder();
        for (int i = 0; i < size; i++) {
            a.append("Name: " + stuList.get(i).getName() + "\tGrade: " + stuList.get(i).getGrade() + "\r\n");
        }

        return a + "total: " + size + " students\r\n";
    }


    }


class StudentComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getGrade()> o2.getGrade())
            return -1;
        else if (o1.getGrade()< o2.getGrade())
            return 1;
    return 0;
    }
}