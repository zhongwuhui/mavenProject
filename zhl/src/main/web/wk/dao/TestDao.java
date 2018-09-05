package wk.dao;

import wk.entity.ceshiyongEntity;
import wk.entity.shEntity;
import wk.entity.user;

import java.util.List;
import java.util.Map;

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
     * 测试添加
     * @param ceshiyongEntity
     */
    void mycsadd(ceshiyongEntity ceshiyongEntity);

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
     void insertShmessage(shEntity shEntity);

    /**
     * 审核表删除信息（根据bsm）
     * @param bsm
     */
     void deleteShmessage(String bsm);

    /**
     * 测试查询信息
     * @param ceshiyongEntity
     * @return
     */
    List<ceshiyongEntity>selectCeshiyongMessage(ceshiyongEntity ceshiyongEntity);


}
