package test;

import mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import pojo.Category;

import java.util.List;

/**
 * Created by chuliu on 2017/8/10.
 */
@Component("test")
public class Test2 {

    @Autowired
    private CategoryMapper categoryMapper;

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Test2 t = (Test2)context.getBean("test");
        List<Category> list = t.categoryMapper.list();

        System.out.println(list);
    }
}
