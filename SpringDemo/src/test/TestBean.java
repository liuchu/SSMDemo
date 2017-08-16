package test;

import bean.Category;
import bean.Product;
import bean.TestConstructInjectionBean;
import bean.TestSetterInjectionBean;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.ProductService;

/**
 * Created by chuliu on 2017/7/27.
 */
public class TestBean {

    public static void main(String[] args) {

        //这里使用applicationContext来获取bean
        //也可以用BeanFactory来获取bean, applicationContext拥有beanFactory所有的功能， 并且还有一些额外的功能。
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        ProductService product = (ProductService)context.getBean("product_service");
        //TestConstructInjectionBean t = (TestConstructInjectionBean)context.getBean("tcib");
        TestSetterInjectionBean t = (TestSetterInjectionBean)context.getBean("tsib");
        t.draw();

        /*product.Method1(2,3);
        System.out.println("-----------");
        product.Method2(1,2);
        System.out.println("-----------");
        product.Method3(1,2);*/

    }
}
