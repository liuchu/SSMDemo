package bean;


/**
 * Created by chuliu on 2017/8/16.
 */
public class TestSetterInjectionBean {

    private String type;
    private int  height;

    public TestSetterInjectionBean() {
    }



    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(int height) {
        this.height= height;
    }

    public void draw()
    {
        System.out.println(this.type+" triangle is drawn of height "+this.height);
    }
}
