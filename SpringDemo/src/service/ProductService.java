package service;

import org.springframework.stereotype.Component;

/**
 * Created by chuliu on 2017/7/29.
 */

@Component("product_service")
public class ProductService {

    public int Method1(int a, int b){
        System.out.println("Calling ProductService.Method1()");
        return 1;
    }

    public int Method2(int a, int b){
        System.out.println("Calling ProductService.Method2()");
        return 2;
    }

    public int Method3(int a, int b){
        System.out.println("Calling ProductService.Method3()");
        return 3;
    }

}
