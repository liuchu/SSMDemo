package dao;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import pojo.Category;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by chuliu on 2017/8/2.
 */
public class CategoryDao {

    private static SqlSessionFactory sqlSessionFactory;

    public CategoryDao() throws IOException {

       if (sqlSessionFactory==null) {
           String resource = "mybatis-config.xml";
           InputStream configInputStream = Resources.getResourceAsStream(resource);
           sqlSessionFactory = new SqlSessionFactoryBuilder().build(configInputStream);
       }

    }

    //List all category
    public List<Category> listCategory() throws IOException {

        SqlSession session = sqlSessionFactory.openSession();
        List<Category> categoryList= session.selectList("listCategory");

        /*for (Category cate:
                categoryList) {
            System.out.println(cate.toString());
        }*/
        System.out.println("SQL: select MANY category");

        session.commit();
        session.close();
        return categoryList;
    }

    //Insert new category
    public void addCategory(Category category){

        SqlSession session = sqlSessionFactory.openSession();

        session.insert("addCategory",category);
        System.out.println("SQL: add a new category");
        session.commit();
        session.close();

    }

    //Delete a category
    public void deleteCategory(Category category){
        SqlSession session = sqlSessionFactory.openSession();

        session.delete("deleteCategory",category);
        System.out.println("SQL: delete a category");
        session.commit();
        session.close();
    }

    //Update a category
    public void updateCategory(Category category){
        SqlSession session = sqlSessionFactory.openSession();

        session.update("updateCategory",category);
        System.out.println("SQL: update a category");
        session.commit();
        session.close();
    }

    //select a category via id
    public Category selectCategory(int id){
        SqlSession session = sqlSessionFactory.openSession();

        Category category = session.selectOne("selectCategory",id);
        System.out.println("SQL: select a category");
        session.commit();
        session.close();

        return category;
    }
}
