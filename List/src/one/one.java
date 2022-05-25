/*设计类Student和类StudentClass。

(1) 类Student有字符串属性name、double属性grade和int属性age

有带参数的构造方法，可设置三个属性的值

有各个属性的置取方法

(2)类StudentClass有List属性stuList，使用ArrayList存放班级成员。

有createClass()方法: 使用下面三个预置数据的数组，为班级添加成员并设置班级人数。

String names[] = {"Tom","Jerry","Snoopy","Mary","Rose"};

              double grades[] = {67,78.5,98,76.5,90};

              int ages[] = {17,18,18,19,17};

有sort()方法：使用冒泡算法实现对班级成员按成绩从大到小排序

有output()方法：实现指定格式的班级成员信息输出

有add()方法：实现添加学生*/
package one;

import java.util.ArrayList;

public class one {
    public static void main(String[] args) {
        StudentClass sClass = new StudentClass();
        sClass.createClass();
        sClass.add(new Student("Steven", 18, 88));
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
        Student temp;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 1; j < size; j++) {
                if (stuList.get(j - 1).getGrade() < stuList.get(j).getGrade()) {
                    temp = stuList.get(j - 1);
                    stuList.set(j - 1, stuList.get(j));
                    stuList.set(j, temp);
                }
            }
        }
    }

    public String output() {
        StringBuilder a = new StringBuilder();
        for (int i = 0; i < size; i++) {
            a.append("Name: " + stuList.get(i).getName() + "\tGrade: " + stuList.get(i).getGrade() + "\r\n");
        }

        return a+ "total: " + size + " students\r\n";
    }

    public void add(Student a) {

        stuList.add(a);
        size++;
    }

}