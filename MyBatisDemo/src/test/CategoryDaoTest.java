package test;

import dao.CategoryDao;
import pojo.Category;
import pojo.Product;

import java.io.IOException;
import java.util.List;

/**
 * Created by chuliu on 2017/8/2.
 */
public class CategoryDaoTest {

    public static void main(String[] args) throws IOException {
        CategoryDao dao = new CategoryDao();

        /*Category category = new Category();
        category.setName("新的Category_并修改名字");
        category.setId(3);

        dao.updateCategory(category);*/

        Category category = new Category();
        category.setName("新的Category");

        //dao.addCategory(category);
        List<Category> list = dao.listCategory();

        /*for (Category c : list) {
            System.out.println("Category > id="+c.getId()+" name="+c.getName()+" and "+c.getProducts().size()+" products {");

            for (Product p : c.getProducts()) {
                System.out.println("[");
                System.out.println("Product: id="+p.getId()+" name="+p.getName()+" price="+p.getPrice());
                System.out.println("]");
            }
            System.out.println("}");
        }*/

        for (Category c : list) {
            System.out.println("name:"+c.getName());
        }




    }
}
