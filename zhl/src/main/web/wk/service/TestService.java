package wk.service;

import wk.entity.shEntity;
import wk.entity.user;

import java.util.List;
import java.util.Map;

/**
 * Created by 张虎龙 on 2018/8/12.
 */
public interface TestService {
    /**
     * 测试
     * @return
     */
    int testAction();

    /**
     * 测试添加
     * @param allParam
     */
    void addUser(user allParam);


    /**
     * 登录
     * @param user
     * @return
     */
    List<user> login(user user);

    /**
     * 审核信息
     * @param shEntity
     * @return
     */
    List<shEntity> shcheckServer(shEntity shEntity);

    /**
     * 审核插入
     * @param shEntity
     */
   void insertShmessage(shEntity shEntity);

    /**
     * 审核信息删除
     * @param bsm
     */
    void deleteSh(String bsm);


}

