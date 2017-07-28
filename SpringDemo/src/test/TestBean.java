package test;

import bean.Category;
import bean.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by chuliu on 2017/7/27.
 */
public class TestBean {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Product product = (Product)context.getBean("product");

        System.out.println("Product name: "+product.getName());
        System.out.println("Product category: "+product.getCategory().getName());

    }
}
