package wk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import wk.entity.yydjActionResult;
import wk.entity.yydjParame;
import wk.entity.yydjresult;
import wk.service.yydjService;

import java.util.List;
import java.util.Map;

/**
 * @Author: zhanghl
 * @Date: 2018/11/14 18:08
 */
@Controller
public class fszce {
    @Autowired
    yydjService yydjService;

    @RequestMapping(value = "fscsValalue",method= RequestMethod.POST,produces = "application/json")
    public void fsce(@RequestParam Map<String,String> allRequestParam){


        yydjParame yydjParame =new yydjParame();

        if(allRequestParam.containsKey("dybm")){
           yydjParame.setDybm(allRequestParam.get("dybm"));
        }
        if(allRequestParam.containsKey("qlbsm")){
            yydjParame.setQlbsm(allRequestParam.get("qlbsm"));
        }
        if(allRequestParam.containsKey("dybsm")){
            yydjParame.setDybsm(allRequestParam.get("dybsm"));
        }
       List<yydjActionResult> result= yydjService.getYydj(yydjParame);

    }
}
