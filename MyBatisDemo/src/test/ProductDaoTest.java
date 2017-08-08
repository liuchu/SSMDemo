package test;

import dao.ProductDao;
import pojo.Product;

import java.io.IOException;
import java.util.List;

/**
 * Created by chuliu on 2017/8/2.
 */
public class ProductDaoTest {

    public static void main(String[] args) throws IOException {
        ProductDao productDao = new ProductDao();

        List<Product> productList = productDao.listProductWithCategory();

        for (Product p : productList) {
            System.out.println(p);
        }


    }
}
