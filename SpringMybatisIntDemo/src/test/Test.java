package test;

import mapper.CategoryMapper;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pojo.Category;

import java.util.List;
import org.junit.*;

/**
 * Created by chuliu on 2017/8/10.
 */


@ContextConfiguration("classpath:applicationContext.xml")
public class Test {

    @Autowired
    private CategoryMapper categoryMapper;

    public void testList() {
        System.out.println(categoryMapper);
        List<Category> categoryList =categoryMapper.list();

        for (Category c : categoryList) {
            System.out.println(c);
        }

    }

    public static void main(String[] args) {
        //ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //CategoryMapper product = (CategoryMapper)context.getBean("product_service");
        new Test().testList();
    }
}
