package bean;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by chuliu on 2017/8/16.
 */
public class TestCollectionInjectionBean {
    private List<String> stringList;
    private Set<String> stringSet;
    private Map<String,String> stringMap;
    private List<Category> categoryList;

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public Set<String> getStringSet() {
        return stringSet;
    }

    public void setStringSet(Set<String> stringSet) {
        this.stringSet = stringSet;
    }

    public Map<String, String> getStringMap() {
        return stringMap;
    }

    public void setStringMap(Map<String, String> stringMap) {
        this.stringMap = stringMap;
    }

    public List<Category> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<Category> categoryList) {
        this.categoryList = categoryList;
    }

    @Override
    public String toString() {
        return "stringList:" + stringList +
                ", stringSet:" + stringSet +
                ", stringMap:" + stringMap +
                ", categoryList:" + categoryList +
                '}';
    }
}
