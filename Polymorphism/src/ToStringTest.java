public class ToStringTest {

        public static void main(String[] args) {
            Animals dog = new Dogs();//上转型


            dog.eat();/*dog.eat();调用Dog类中的eat方法，
        			Dog类中的eat方法是对父类Animal中的eat方法的重写，所以可以调用*/


           /* dog.run();此条代码无法解析，因为run方法是Dog类独有的方法，
        			上转型后的变量，不能调用子类中`独有`的方法*/

            Dogs a=(Dogs) dog;//下转型
            /*我们将dog对象进行下转型，原本Animal类型的dog对象，转型为Dog类型，即可运行*/
            a.run();
        }
    }
    class Animals{
        public void eat(){
            System.out.println("animal eatting...");
        }
        /*..*/

    }
    class Dogs extends Animals{
        public void eat(){//对于父类Animal中eat方法的重写
            System.out.println("我吃骨头");
        }
        public void run(){//子类Dog独有的方法
            System.out.println("狗会跑");
        }
        /*..*/
    }