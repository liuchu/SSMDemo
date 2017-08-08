package dao;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import pojo.Order;
import pojo.Product;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by chuliu on 2017/8/8.
 */
public class OrderDao {

    private static SqlSessionFactory sqlSessionFactory;

    public OrderDao() throws IOException {

        if (sqlSessionFactory==null) {
            String resource = "mybatis-config.xml";
            InputStream configInputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(configInputStream);
        }

    }

    public List<Order> listOrders(){
        SqlSession session = sqlSessionFactory.openSession();

        List<Order> orderList = session.selectList("listOrder");

        System.out.println("SQL: list all orders with category");

        session.commit();
        session.close();
        return orderList;
    }
}
