package wk.service;

import wk.entity.ceshiyongEntity;
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
     * @param ceshiyongEntity
     */
    void addmycssdd(ceshiyongEntity ceshiyongEntity);

    /**
     * 测试添加
     * @param ceshiyongEntity
     * @return
     */
    List<ceshiyongEntity> ceshiyongServer(ceshiyongEntity ceshiyongEntity);

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

