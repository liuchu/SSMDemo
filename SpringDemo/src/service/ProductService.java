package service;

import bean.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by chuliu on 2017/7/29.
 */

@Component("product_service")
public class ProductService {

    private Category category;

    @Resource(name = "category")
    public void setCategory(Category category) {
        this.category = category;
    }

    public int Method1(int a, int b){
        System.out.println("Calling ProductService.Method1()");
        return 1;
    }

    public Category Method2(int a, int b){
        System.out.println("Calling ProductService.Method2()");
        return category;
    }



}
