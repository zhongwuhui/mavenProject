package wk.entity;

import java.util.List;

/**
 * @Author: zhanghl
 * @Date: 2018/11/16 16:09
 */
public class yydjParame {
    private String qlbsm;
    private  String dybsm;
    private List<String> qlbsmList;

    public List<String> getQlbsmList() {
        return qlbsmList;
    }

    public void setQlbsmList(List<String> qlbsmList) {
        this.qlbsmList = qlbsmList;
    }

    public String getQlbsm() {
        return qlbsm;
    }

    public void setQlbsm(String qlbsm) {
        this.qlbsm = qlbsm;
    }

    public String getDybsm() {
        return dybsm;
    }

    public void setDybsm(String dybsm) {
        this.dybsm = dybsm;
    }

    public String getDybm() {
        return dybm;
    }

    public void setDybm(String dybm) {
        this.dybm = dybm;
    }

    private String dybm;
}
