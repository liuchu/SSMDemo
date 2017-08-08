package mapper;

import java.util.List;

import org.apache.ibatis.annotations.*;
import pojo.Category;

/**
 * Created by chuliu on 2017/8/8.
 */
public interface CategoryMapper {

    @Select("select * from category_")
    public List<Category> listCategory();

    @Select("select * from category_ where id= #{id} ")
    public Category getCategory(int id);

    @Delete("DELETE from category_ where id = #{id}")
    public void deleteCategory(int id);

    @Insert("INSERT INTO category_ ( name ) VALUES ( #{name} )")
    public int addCategory(Category category);

    @Update("UPDATE category_ set name=#{name} where id = #{id}")
    public int updateCategory(Category category);

    @Select("SELECT c.id 'c_id', c.`name` 'c_name', p.id 'p_id', p.`name` 'p_name', p.price 'p_price'\n" +
            "        FROM category_ c\n" +
            "        LEFT JOIN product_ p\n" +
            "        ON c.id=p.cid")
    @Results({
            @Result(property = "id", column = "c_id"),
            @Result(property = "name", column = "c_name"),
            @Result(property = "products", javaType = List.class, column = "id", many = @Many(select = "mapper.ProductMapper.listByCategory") )
    })
    public List<Category> listCategoryWithProductList();

}
