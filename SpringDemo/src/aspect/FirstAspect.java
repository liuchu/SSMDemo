package aspect;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by chuliu on 2017/8/18.
 */

@Component("firstAspect")
@Aspect
public class FirstAspect {

    public void loggingAdvice()
    {
        System.out.println("Advice run. Get method is called");
    }

    @Before("execution(public * service.ProductService.*(..))")
    public void anyPublicMethodOfTrasferService(){
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