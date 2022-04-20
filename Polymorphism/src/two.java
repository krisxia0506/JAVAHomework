public class two {
    public static void main(String[] args) {
        Feeder fd = new Feeder("Tom");
        Dog dog = new Dog();
        Bone bone = new Bone(500);

        fd.feed(dog, bone);
        System.out.println("-----------------");
        fd.feed(new Cat(), new Fish(100));

    }
}
class Feeder {
    private String name;
    public Feeder(String name) {
        this.name = name;
    }
    public void feed(Animal a, Food f) {
        a.eat(f);
        System.out.println("Feeder "+name+" feed "+a+ " with "+f.getWeight()+"g "+f+".");
    }
}
class Animal{
    public void eat(Food food){
        System.out.println("It's time to eat "+food+".");
    }
}
class Food{
    private int weight;

    public Food(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
class Dog extends Animal{

    @Override
    public String toString() {
        return super.getClass().getName();
    }//获取类名
    @Override
    public void eat(Food food){
        System.out.println("It's time to eat "+food.toString()+".");
        System.out.println("Dog like "+ food);
    }
}
class Cat extends Animal{
    @Override
    public String toString() {
        return super.getClass().getName();
    }
    @Override
    public void eat(Food food){
        System.out.println("It's time to eat "+food+".");
        System.out.println("Cat like "+food);
    }
}


class Bone extends Food{
    public Bone(int i) {
        super(i);
    }

    @Override
    public String toString() {
        return super.getClass().getName();
    }
}
class Fish extends Food{
    public Fish(int i) {
        super(i);
    }

    @Override
    public String toString() {
        return super.getClass().getName();
    }
}