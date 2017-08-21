package aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by chuliu on 2017/8/20.
 * Define all point cuts here
 */
@Component
@Aspect
public class PointCuts {

    @Pointcut("execution(public * service.ProductService.*(..))")
    public void logStart(){
        System.out.println("firstAspect: Called in any public method of ProductService");
    }

    @Pointcut("within(service..*)")
    public void anyPublicMethod(){
        System.out.println("firstAspect: Called in all public methods");
    }

    @Pointcut("bean(ProductService)")
    public void withReturnType(){
        System.out.println("firstAspect:Called in method of ProductService who return Category");
    }
}
