package bean;

import javax.annotation.Resource;

import listener.DrawEvent;
import listener.TestEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 * Created by chuliu on 2017/8/17.
 */

//@Component
public class Circle implements ApplicationEventPublisherAware
{
    private Point center;
    private ApplicationEventPublisher publisher;

    /**
     * @param center the center to set
     */
    @Resource(name="pointB")
    public void setCenter(Point center)
    {
        this.center = center;
    }

    public void draw()
    {
        System.out.println("Circle is Drawn");
        DrawEvent drawEvent = new DrawEvent(this);
        TestEvent testEvent = new TestEvent(this);
        publisher.publishEvent(drawEvent);
        publisher.publishEvent(testEvent);
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher publisher)
    {
        this.publisher = publisher;
    }
}
