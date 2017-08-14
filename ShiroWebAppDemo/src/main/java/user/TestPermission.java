package user;

import org.apache.shiro.authz.*;
import org.apache.shiro.authz.Permission;

/**
 * Created by chuliu on 2017/8/14.
 */
public class TestPermission implements Permission {

    public boolean implies(Permission permission) {
        return false;
    }
}
