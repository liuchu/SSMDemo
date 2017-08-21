package aspect;

import org.aspectj.lang.annotation.*;
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

    @Before(value = "aspect.PointCuts.logProduct()")
    public void LogStart(){
        System.out.println("firstAspect: Before");
    }

    @After(value = "aspect.PointCuts.logProduct()")
    public void LogEnd(){
        System.out.println("firstAspect: After");
    }

   /* @Pointcut("within(service..*)")
    public void anyPublicMethod(){
        System.out.println("firstAspect: Called in all public methods");
    }

    @Pointcut("bean(ProductService)")
    public void withReturnType(){
        System.out.println("firstAspect:Called in method of ProductService who return Category");
    }*/
}