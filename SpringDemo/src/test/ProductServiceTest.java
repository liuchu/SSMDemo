package test;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.ProductService;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * Created by chuliu on 2017/7/30.
 * 1、@BeforeClass所修饰的方法在所有方法加载前执行，而且他是静态的在类加载后就会执行该方法，

 　　　　　　　  在内存中只有一份实例，适合用来加载配置文件。

 　2、@AfterClass所修饰的方法在所有方法执行完毕之后执行，通常用来进行资源清理，例如关闭数据库连接。

 　3、@Before和@After在每个测试方法执行前都会执行一次。

 　1、@Test(excepted=XX.class) 在运行时忽略某个异常。

 　2、@Test(timeout=毫秒) 允许程序运行的时间。

 　3、@Ignore 所修饰的方法被测试器忽略。

 　4、RunWith 可以修改测试运行器 org.junit.runner.Runner
 */
//@RunWith(Parameterized.class)
public class ProductServiceTest {

    private static ProductService productService;
    private int expected;
    private int input1;
    private int input2;

    //Called when the classed is loaded
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {

        System.out.println("ProductServiceTest testing begin!!!");

        if(productService==null){

            ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

            productService = (ProductService)context.getBean("product_service");
        }

    }

    //Called when the all Test methods executed
    @AfterClass
    public static void setUpAfterClass() throws Exception {
        System.out.println("ProductServiceTest testing end!!!");
    }

    //Called before every Test method run
    @Before
    public void before() throws Exception {
        System.out.println("a method testing begin");
        if(productService==null){

            ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

            productService = (ProductService)context.getBean("product_service");
        }
    }

    //Called after every Test method run
    @After
    public void after() throws Exception {
        System.out.println("a method testing end");
    }

    /*@Parameterized.Parameters
    public static Collection<Object[]> t() {
        return Arrays.asList(new Object[][]{
                {1,1,2},
                {1,2,3}
        });
    }*/

    /*public ProductServiceTest(int expected,int input1,int input2) {
        this.expected = expected;
        this.input1 = input1;
        this.input2 = input2;
    }*/

    @Test
    public void Method1Test(){
        assertEquals(1, productService.Method1(2,3));
    }

    @Test
    public void Method2Test(){
        assertEquals(2, productService.Method2(1,2));
    }

    @Test
    public void Method3Test(){
        assertEquals(3, productService.Method3(1,2));
    }

    @Test
    public void Method1TestA(){
        productService.Method1(2,3);
    }

}
