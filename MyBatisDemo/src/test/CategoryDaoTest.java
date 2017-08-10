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

        /*for (int i=3; i<=100; i++) {
            Category category = new Category();
            category.setName("category"+i);
            dao.addCategory(category);
        }*/


        //List<Category> list = dao.listCategoryWithPaging(2,10);

        /*for (Category c : list) {
            System.out.println("Category > id="+c.getId()+" name="+c.getName()+" and "+c.getProducts().size()+" products {");

            for (Product p : c.getProducts()) {
                System.out.println("[");
                System.out.println("Product: id="+p.getId()+" name="+p.getName()+" price="+p.getPrice());
                System.out.println("]");
            }
            System.out.println("}");
        }*/

        /*for (Category c : list) {
            System.out.println("name:"+c.getName());
        }*/

        Category category1 = dao.selectCategory(2);
        Category category2 = dao.selectCategory(2);
        Category category3 = dao.selectCategory(2);
        Category category4 = dao.selectCategory(2);

    }
}
