package bean;

/**
 * Created by chuliu on 2017/8/16.
 */
public class TestAutowireByNameBean {

    private String name;
    private Category category;

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
