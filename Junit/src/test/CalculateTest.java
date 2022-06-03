package test;

import calculate.Calculate;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



/**
 * Created on 2022-05-27 17:24
 *
 * @author Xia Jiayi
 */
public class CalculateTest {
    /*
    *初始化方法
    *  */
    @BeforeMethod   // 初始化方法
    public void beforeMethod() {
        System.out.println("beforeMethod");
    }
    @AfterMethod    //清理方法
    public void afterMethod() {
        System.out.println("afterMethod");
    }


    @Test   //测试异常
    public void testAdd() {  //测试异常
        Calculate c = new Calculate(); // 创建对象
        Assert.assertEquals(3, c.add(1, 2)); //断言
    }

    @Test
    public void testSub() {
        Calculate c = new Calculate();
        Assert.assertEquals(1, c.sub(3, 2));
    }

    @Test
    public void testMul() {
        Calculate c = new Calculate();
        Assert.assertEquals(6, c.mul(2, 3));
    }

    @Test
    public void testDiv() {
        Calculate c = new Calculate();
        Assert.assertEquals(2, c.div(6, 3));
    }
}
