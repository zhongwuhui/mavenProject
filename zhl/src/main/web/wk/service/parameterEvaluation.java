package wk.service;

import wk.entity.shEntity;
import wk.entity.user;

import java.util.List;
import java.util.Map;

/**
 * 单表操作服务接口
 * Created by Administrator on 2018/8/29.
 */
public interface parameterEvaluation {

    /**
     * 审核实体
     * @param allRequestParam
     * @param shEntity
     */
    List<shEntity> getshEntity(Map<String,String> allRequestParam, shEntity shEntity);

    /**
     * 测试实体
     * @param allRequestParam
     * @param user
     * @return
     */
   void getcsAdd(Map<String,String> allRequestParam,user user);


}
