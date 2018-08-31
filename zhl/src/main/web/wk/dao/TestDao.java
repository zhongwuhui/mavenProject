package wk.dao;

import wk.entity.shEntity;
import wk.entity.user;

import java.util.List;

/**
 * 单表操作dao层接口
 * @author zhanghl
 * @date  2018/7/5 18:22
 */
public interface TestDao {
    /**
     * 练习输出表中总共有多少条记录
     * @param
     * @return int
     */
    int selectCount();

    /**
     * 登陆密码账号查询
     * @param user
     * @return int
     */
    List<user> selecusermessage(user user);

    /**
     * 审核表查询
     * @param shEntity
     * @return
     */
    List<shEntity> selectShMessage(shEntity shEntity);

    /**
     * 审核表添加信息
     * @param shEntity
     * @return
     */
    String insertShmessage(shEntity shEntity);

}
