package test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import pojo.Category;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by chuliu on 2017/8/1.
 */
public class TestCategory{

    public static void testListCategory() throws IOException {

        String resource = "mybatis-config.xml";
        InputStream configInputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(configInputStream);

        SqlSession session = sqlSessionFactory.openSession();
        List<Category> categoryList= session.selectList("listCategory");

        for (Category cate:
        categoryList) {
            System.out.println(cate.toString());
        }

        session.commit();
        session.close();
    }

    public static void main(String[] args) throws IOException {
        testListCategory();
    }


}
