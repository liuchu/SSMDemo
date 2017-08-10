package test;


import mapper.CategoryMapper;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pojo.Category;

import java.util.List;


/**
 * Created by chuliu on 2017/8/10.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Test {

    @Autowired
    private CategoryMapper categoryMapper;

    @org.junit.Test
    public void testList() {
        System.out.println(categoryMapper);
        List<Category> categoryList =categoryMapper.list();

        //ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //CategoryMapper mapper = (CategoryMapper)context.getBean("product_service");

        for (Category c : categoryList) {
            System.out.println(c);
        }

    }

    public static void main(String[] args) {
        Test t = new Test();

        t.testList();

    }
}
