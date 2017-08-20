package bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by chuliu on 2017/8/16.
 */
//@Component
public class TestAutowireByConstructBean {

    private String name;
    private Category category;

    public TestAutowireByConstructBean(){

    }

    public TestAutowireByConstructBean(Category category){
        this.category = category;
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

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "TestAutowireByNameBean{" +
                "name='" + name + '\'' +
                ", category=" + category +
                '}';
    }
}
