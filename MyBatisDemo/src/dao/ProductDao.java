package dao;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import pojo.Category;
import pojo.Product;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by chuliu on 2017/8/6.
 */
public class ProductDao {

    private static SqlSessionFactory sqlSessionFactory;

    public ProductDao() throws IOException {

        if (sqlSessionFactory==null) {
            String resource = "mybatis-config.xml";
            InputStream configInputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(configInputStream);
        }

    }

    public List<Product> listProductWithCategory(){
        SqlSession session = sqlSessionFactory.openSession();

        List<Product> productList= session.selectList("listProductWithCategory");

        System.out.println("SQL: list all products with category");

        session.commit();
        session.close();
        return productList;
    }
}
