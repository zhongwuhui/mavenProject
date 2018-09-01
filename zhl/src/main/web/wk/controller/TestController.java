package wk.controller;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import wk.service.TestService;
import wk.entity.*;
import wk.service.parameterEvaluation;

import javax.sql.rowset.serial.SerialStruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@Controller
public class TestController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    @Qualifier("testService")
    private TestService testService;

    @Autowired
    @Qualifier("getShEntiry")
    private parameterEvaluation getEntiry;

    @RequestMapping(value = "index")
   /* @ResponseBody*/
    public String indexTest2( @RequestParam("username") String userName, @RequestParam("password") String password, user user) {
       System.out.println("进来了");

       /* 测试用的 */
        int i = testService.testAction();
        System.out.println(i);


        /**
         * 用户登录信息
         */
       user.setUserNumber(userName);
       user.setPassword(password);
      List<user> user1=testService.login(user);
      if(user1.size()>0){
          return "redirect:/home.jsp";
      }
            return "redirect:/error.jsp";

     }

    /**
     * 获取审核表信息
     * @param allRequestParam
     */
    @RequestMapping(value = "shCheck" ,method = RequestMethod.POST,produces ="application/json")
    public void shCho(@RequestParam Map<String,String> allRequestParam){

       shEntity shmessage=new shEntity();
        getEntiry.getshEntity(allRequestParam,shmessage);
       List<shEntity> list=testService.shcheckServer(shmessage);
       for(shEntity s:list){
         String bdcdyh=s.getBdcdyh();
       }



       /*sh= testService.shcheckServer(shmessage);*/
    }

    /**
     * 添加审核表信息
     * @param allRequestParam
     */
    @RequestMapping(value = "shInsert",method = RequestMethod.POST,produces = "application/json")
    public void shInst(@RequestParam Map<String,String> allRequestParam){
        shEntity shmessage=new shEntity();
        getEntiry.getshEntity(allRequestParam,shmessage);
        testService.insertShmessage(shmessage);
        String bsm=shmessage.getBsm();
        String ywh=shmessage.getYwh();

        System.out.println("添加成功"+bsm);


    }

    @RequestMapping(value = "shDelete",method = RequestMethod.POST,produces = "application/json")
    public void shDelete(@RequestParam String bsm){
        bsm=String.valueOf(bsm);
        testService.deleteSh(bsm);

    }

}
