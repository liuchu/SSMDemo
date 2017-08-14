package user;

import java.util.*;

/**
 * Created by chuliu on 2017/8/12.
 */
public class UserEntry {

    static List<User> userList = new ArrayList<User>();

    /*
     * 构造三个静态的用户数据，作为Shiro的用户数据来源
     * */
    static {

        Permission permission1 = new Permission("administration");
        Permission permission2 = new Permission("development");
        Permission permission3 = new Permission("browse");

        Role role1 = new Role("admin",permission1);
        Set<Role> roleSet1 = new HashSet<Role>();
        roleSet1.add(role1);
        Role role2 = new Role("developer",permission2);
        Set<Role> roleSet2 = new HashSet<Role>();
        roleSet2.add(role2);
        Role role3 = new Role("user",permission3);
        Set<Role> roleSet3 = new HashSet<Role>();
        roleSet3.add(role3);

        User user1 = new User("chuliu","Sh@nghai12e".toCharArray(),roleSet1);

        User user2 = new User("cliu025","Sh@nghai12w".toCharArray(), roleSet2);

        User user3 = new User("chul","Sh@nghai12q".toCharArray(), roleSet3);

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
    }

    public static List<User> getUserListExample(){
        return userList;
    }

    public static boolean containUser(String username){

        for ( User user : userList) {
            if(username.equals(user.getUsername())){
                return true;
            }
        }
        return false;
    }

    public static User getUserByName(String username){

        for ( User user : userList) {
            if(username.equals(user.getUsername())){
                return user;
            }
        }

        return null;
    }

    public static Set<String> getPermissions(String username){
        User user = getUserByName(username);
        Set<Role> objectRoles = user.getRoles();
        Set<String> stringPermissions = new HashSet<String>();

        for (Role role : objectRoles){
            stringPermissions.add(role.getPermission().getName());
        }

        return stringPermissions;

    }

    /*public static Set<String> getPermissions(String username){

    }*/

    public static Set<String> getRoles(String username){
        User user = getUserByName(username);
        Set<String> stringRoles = new HashSet<String>();

        for (Role role:user.getRoles()) {
            stringRoles.add(role.getName());
        }

        return stringRoles;
    }


}
