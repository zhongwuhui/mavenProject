package wk.entity;

/**
 * Created by Administrator on 2018/9/5.
 */
public class ceshiyongEntity {
    protected  String	userId;
    protected  String	userName;
    protected  String	NumberId;
    protected  String	roler;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNumberId() {
        return NumberId;
    }

    public void setNumberId(String numberId) {
        NumberId = numberId;
    }

    public String getRoler() {
        return roler;
    }

    public void setRoler(String roler) {
        this.roler = roler;
    }


    public String getClassMyId() {
        return classMyId;
    }

    public void setClassMyId(String classMyId) {
        this.classMyId = classMyId;
    }

    protected  String classMyId;

}
