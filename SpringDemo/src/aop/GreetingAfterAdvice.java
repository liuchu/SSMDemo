package aop;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * Created by chuliu on 2017/8/21.
 */

public class GreetingAfterAdvice implements AfterReturningAdvice {

    @Override
    public void afterReturning(Object result, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("After");
    }
}
