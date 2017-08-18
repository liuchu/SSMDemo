package listener;

import org.springframework.context.ApplicationEvent;

/**
 * Created by chuliu on 2017/8/17.
 */
public class TestEvent extends ApplicationEvent
{


    private static final long serialVersionUID = 6973014356268900608L;

    public TestEvent(Object source)
    {
        super(source);
    }

    public String toString()
    {
        return "Test event occurred";
    }
}
