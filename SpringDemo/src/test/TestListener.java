package test;

import bean.Circle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by chuliu on 2017/8/17.
 */
public class TestListener {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Circle circle = (Circle)context.getBean("circle");
        circle.draw();
    }
}
