package proxy;

/**
 * Created by chuliu on 2017/8/21.
 */
public class GreetingImpl implements Greeting {

    @Override
    public void sayHello(String name) {

        System.out.println("Hello! " + name);
    }


}
