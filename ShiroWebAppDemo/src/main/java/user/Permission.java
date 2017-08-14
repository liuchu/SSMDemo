package user;

/**
 * Created by chuliu on 2017/8/12.
 */
public class Permission{

    //Eat
    //Drink
    //Play
    String name;

    public Permission(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        char[] chars = "ABCD".toCharArray();
        System.out.println(String.valueOf(chars));
    }
}
