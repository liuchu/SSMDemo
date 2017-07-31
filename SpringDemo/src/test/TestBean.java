package test;

import bean.Category;
import bean.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.ProductService;

/**
 * Created by chuliu on 2017/7/27.
 */
public class TestBean {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        ProductService product = (ProductService)context.getBean("product_service");

        product.Method1(2,3);
        System.out.println("-----------");
        product.Method2(1,2);
        System.out.println("-----------");
        product.Method3(1,2);

    }
}
