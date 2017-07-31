package bean;

import org.springframework.stereotype.Component;

/**
 * Created by chuliu on 2017/7/27.
 */
@Component("cate")
public class Category {

    private int id;
    private String name = "category 1st - new";

    public Category() {
    }

    public Category(int id, String name) {
        this.id = id;
        this.name = name;
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
}
