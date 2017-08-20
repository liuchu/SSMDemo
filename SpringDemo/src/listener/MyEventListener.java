package listener;


import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by chuliu on 2017/8/17.
 */

@Component
public class MyEventListener<DrawEvent extends ApplicationEvent> implements ApplicationListener<DrawEvent>
{

    @Override
    public void onApplicationEvent(DrawEvent drawEvent) {
        System.out.println("Trig event: "+drawEvent.getClass().getName());
        System.out.println(drawEvent.toString());
    }
}
