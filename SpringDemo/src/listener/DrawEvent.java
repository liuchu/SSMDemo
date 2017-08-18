package listener;


import org.springframework.context.ApplicationEvent;

/**
 * Created by chuliu on 2017/8/17.
 */
public class DrawEvent extends ApplicationEvent
{


    private static final long serialVersionUID = 6973014356268900607L;

    public DrawEvent(Object source)
    {
        super(source);
    }

    public String toString()
    {
        return "Draw event occurred";
    }
}
