package wk.dao;

import wk.entity.shEntity;
import wk.entity.user;

import java.util.List;

/**
 * Created by Administrator on 2018/8/29.
 * discript:单表操作
 */
public interface Simple {
    /**
     * 查询审核表相关信息
     * @param shEntity
     * @return
     */
    List<shEntity> selectShMessage(shEntity shEntity);







}
