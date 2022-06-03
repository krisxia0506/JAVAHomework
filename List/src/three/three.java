/*设计类Student和类StudentClass。

(1) 类Student有字符串属性name、double属性grade和int属性age

有带参数的构造方法，可设置三个属性的值

有各个属性的置取方法

(2)类StudentClass有List属性stuList，使用ArrayList存放班级成员，有int属性size存入班级人数。

有createClass()方法: 使用下面三个预置数据的数组，为班级添加成员并设置班级人数。

String names[] = {"Tom","Jerry","Snoopy","Mary","Rose"};

              double grades[] = {67,78.5,98,76.5,90};

              int ages[] = {17,18,18,19,17};

有sort()方法：实现对班级成员按排序，排序条件是先年龄从小到大，若年龄相同再按姓名字母顺序

有output()方法：实现指定格式的班级成员信息输出

       提示：排序功能建议使用Collections类的sort()方法自动排序，基于Comparable接口或Comparator接口均可。*/
package three;

import java.util.*;

public class three {
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

    public int getAge() {
        return age;
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

        Collections.sort(stuList, a);

    }

    public String output() {
        StringBuilder a = new StringBuilder();
        for (int i = 0; i < size; i++) {
            a.append("Age: " + stuList.get(i).getAge() + "\tName: " + stuList.get(i).getName() + "\r\n");
        }

        return a + "total: " + size + " students\r\n";
    }
}


class StudentComparator implements Comparator<Student> {
//    Collator comparator = Collator.getInstance(Locale.CHINA);
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getAge() != o2.getAge()) {
            if (o1.getAge() < o2.getAge())
                return -1;
            else if (o1.getAge() > o2.getAge())
                return 1;
            return 0;
        } else {
            return o1.getName().compareTo(o2.getName());
//            return comparator.compare(o1.getName(), o2.getName());

        }
    }
}