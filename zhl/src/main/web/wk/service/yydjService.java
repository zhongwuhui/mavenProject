package wk.service;

import wk.entity.yydjActionResult;
import wk.entity.yydjParame;
import wk.entity.yydjresult;

import java.util.List;

/**
 * @Author: zhanghl
 * @Date: 2018/11/16 16:02
 */
public interface yydjService {

    List<yydjActionResult> getYydj(yydjParame yydjParame);
}
