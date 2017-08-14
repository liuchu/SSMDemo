package realm;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.Permission;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.SimplePrincipalCollection;
import user.User;
import user.UserEntry;

import java.util.Collection;
import java.util.List;

/**
 * Created by chuliu on 2017/8/12.
 */
public class AuthenticationRealm extends AuthorizingRealm {

    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("Call doGetAuthorizationInf() method");

        //SimplePrincipalCollection spc = (SimplePrincipalCollection) principalCollection;
        String primaryPricipal = (String)principalCollection.getPrimaryPrincipal();

        System.out.println("primaryPricipal:"+primaryPricipal);

        SimpleAuthorizationInfo sat = new SimpleAuthorizationInfo();
        sat.setRoles(UserEntry.getRoles(primaryPricipal));
        sat.setStringPermissions(UserEntry.getPermissions(primaryPricipal));

        return sat;
    }

    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("Call doGetAuthorizationInf() method");
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;

        System.out.println("正在进行用户验证。。。");
        System.out.println("当前用户名:"+token.getUsername());
        System.out.println("当前密码:"+String.valueOf(token.getPassword()));

        System.out.println("当前Credential;:"+token.getCredentials());
        System.out.println("当前Principal:"+token.getPrincipal());
        System.out.println("当前Host:"+token.getHost());

        List<User> userList = UserEntry.getUserListExample();

        if(!UserEntry.containUser(token.getUsername())){
            System.out.println("认证失败A！！！");
            throw new IncorrectCredentialsException("Wrong username and password");

        }


        User appUser = UserEntry.getUserByName(token.getUsername());

        if(String.valueOf(token.getPassword()).equals(String.valueOf(appUser.getPassword()))){
            System.out.println("通过了认证B！！！");
            return new SimpleAuthenticationInfo(appUser.getUsername(), appUser.getPassword(), getName());
        }else{
            System.out.println("认证失败C！！！");
            throw new IncorrectCredentialsException("Wrong username and password");

        }


    }
}
