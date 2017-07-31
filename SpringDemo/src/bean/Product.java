package bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by chuliu on 2017/7/27.
 */
@Component("product")
public class Product {

    private int id;
    private String name = "product 1st - new";
    //1. @Autowired
    //2. @Resource(name="cate")
    @Resource(name="cate")
    private Category category;

    public Product() {
    }

    public Product(int id, String name, Category category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Category getCategory() {
        return category;
    }

    //@Autowired same effect as written at  "private Category category"
    public void setCategory(Category category) {
        this.category = category;
    }
}
