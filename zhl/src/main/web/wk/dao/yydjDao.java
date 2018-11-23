package wk.dao;

import wk.entity.*;

import java.util.List;

/**
 * @Author: zhanghl
 * @Date: 2018/11/16 16:20
 */

public interface yydjDao {

    List<yydj> getyydjShuju(yydjParame yydjParame);
    List<yydj_dygx> getyydjDygxshuj(yydjParame yydjParame);
    List<yydj_zx>  getyydjzxshuju(yydjParame yydjParame);
    List<yydjdfjz_djzm> getyydjDjzmshuj(yydjParame yydjParame);
    List<yydjdjfz_dymx> getyydjDymxshuj(yydjParame yydjParame);



}
