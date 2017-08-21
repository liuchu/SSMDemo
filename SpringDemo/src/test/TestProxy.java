package test;

import aop.GreetingAfterAdvice;
import aop.GreetingAroundAdvice;
import aop.GreetingBeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;
import proxy.*;

/**
 * Created by chuliu on 2017/8/21.
 */
public class TestProxy {

    public static void main(String[] args) {

        //Greeting代理实现Greeting接口，只能用于代理Greeting的实现类
        Greeting greetingProxy1 = new GreetingProxy(new GreetingImpl());
        greetingProxy1.sayHello("Jack");

        //JDKDynamicProxy代理实现InvocationHandler接口，可以代理任何有接口的实现类
        //更为通用
        Greeting greetingProxy2 = new JDKDynamicProxy(new GreetingImpl()).getProxy();
        greetingProxy2.sayHello("Ma");

        //使用CGLib动态代理，可以代理任何类
        GreetingImpl greeting = CGLibDynamicProxy.getInstance().getProxy(GreetingImpl.class);
        greeting.sayHello("Jack");

        ProxyFactory proxyFactory = new ProxyFactory();     // 创建代理工厂
        proxyFactory.setTarget(new GreetingImpl());         // 射入目标类对象
        //proxyFactory.addAdvice(new GreetingBeforeAdvice()); // 添加前置增强
        //proxyFactory.addAdvice(new GreetingAfterAdvice());  // 添加后置增强
        proxyFactory.addAdvice(new GreetingAroundAdvice());

        GreetingImpl greeting2 = (GreetingImpl) proxyFactory.getProxy(); // 从代理工厂中获取代理
        greeting2.sayHello("Chu");                              // 调用代理的方法
    }
}
