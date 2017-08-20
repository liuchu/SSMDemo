package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.ProductService;

/**
 * Created by chuliu on 2017/8/18.
 */
public class TestAOP {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ProductService ps = (ProductService)context.getBean("product_service");
        ps.Method1(1,2);

        ps.Method2(1,2);

    }
}
