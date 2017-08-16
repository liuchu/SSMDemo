package bean;

/**
 * Created by chuliu on 2017/8/16.
 */
public class TestConstructInjectionBean {

    private String type;
    private int    height;
    /**
     * @param type the type to set
     */
 /*public void setType(String type) {
  this.type = type;
 }*/

    public TestConstructInjectionBean(String type)
    {
        this.type = type;
    }
    public TestConstructInjectionBean(int height)
    {
        this.height = height;
    }
    public TestConstructInjectionBean(String type, int height)
    {
        this.type   = type;
        this.height = height;
    }
    public void draw()
    {
        System.out.println(this.type+" triangle is drawn of height "+this.height);
    }
}
