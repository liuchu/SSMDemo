package mapper;

import pojo.Category;

import java.util.List;

/**
 * Created by chuliu on 2017/8/10.
 */
public interface CategoryMapper {

    //Add a category
    public int add(Category category);

    //Delete a category
    public void delete(int id);

    //Get a category
    public Category get(int id);

    //Update a category
    public int update(Category category);

    //List all category
    public List<Category> list();

    //count
    public int count();
}
