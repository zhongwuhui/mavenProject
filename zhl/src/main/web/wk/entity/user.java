package wk.entity;

/**
 * Created by Administrator on 2018/8/27.
 */
public class user {


    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    private String userId;
    private  String userNumber;
    private  String password;

    public String getUserId() {
        return userId;
    }

    public String getUserNumber() {
        return userNumber;
    }

    public String getPassword() {
        return password;
    }

    public String getRoleId() {
        return roleId;
    }

    public String getClassId() {
        return classId;
    }

    private  String roleId;
    private  String classId;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    private  String userName;
}
