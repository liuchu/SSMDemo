package user;

/**
 * Created by chuliu on 2017/8/12.
 */
public class Role {

    String name;
    Permission permission;

    public Role(String name,Permission permission) {
        this.name = name;
        this.permission = permission;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Permission getPermission() {
        return permission;
    }

    public void setPermission(Permission permission) {
        this.permission = permission;
    }
}
