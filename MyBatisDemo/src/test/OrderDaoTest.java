package test;

import dao.OrderDao;
import pojo.Order;
import pojo.OrderItem;

import java.io.IOException;
import java.util.List;

/**
 * Created by chuliu on 2017/8/8.
 */
public class OrderDaoTest {

    public static void main(String[] args) throws IOException {
        OrderDao oDao = new OrderDao();

        List<Order> orderList = oDao.listOrders();

        for (Order o: orderList) {
            System.out.println("++++++++++++++");

            for (OrderItem oi: o.getOrderItems()) {
                System.out.println("--------------");
                System.out.println("order code:"+o.getCode());
                System.out.println("number:"+oi.getNumber());
                System.out.println("Product name:"+oi.getProduct().getName());
                System.out.println("Product price:"+oi.getProduct().getPrice());
                System.out.println("--------------");
            }


            System.out.println("++++++++++++++");
        }
    }
}
