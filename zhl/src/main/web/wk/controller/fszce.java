package wk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @Author: zhanghl
 * @Date: 2018/11/14 18:08
 */
@Controller
public class fszce {
    @RequestMapping(value = "fscsValalue",method= RequestMethod.POST,produces = "application/json")
    public void fsce(@RequestParam Map<String,String> allRequestParam){
        return;
    }
}
