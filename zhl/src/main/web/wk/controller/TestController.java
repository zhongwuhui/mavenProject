package wk.controller;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.sun.org.glassfish.gmbal.ParameterNames;
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
import java.util.HashMap;
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
     * 测试添加
     * @param allRequestParam
     */
   @RequestMapping(value = "ceshiAdd" ,method = RequestMethod.POST,produces ="application/json")
    public void ceshAdd(@RequestParam Map<String,String> allRequestParam){
      List<String>userFieldName=new ArrayList<>();
      List userFiledValue=new ArrayList();
      Map allParam= new HashMap<>();
      user userEntity=new user();
       getEntiry.getcsAdd(allRequestParam,userEntity);
      fuzhi(userFieldName,userFiledValue,allRequestParam,allParam);
      System.out.print("进入了控制层");
      /*testService.addUser(allParam);*/
       testService.addUser(userEntity);
      System.out.print("从控制层出来了");


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
       int a=10;
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

    /**
     * 审核表删除信息
     * @param bsm
     */
    @RequestMapping(value = "shDelete",method = RequestMethod.POST,produces = "application/json")
    public void shDelete(@RequestParam String bsm){
        bsm=String.valueOf(bsm);
        testService.deleteSh(bsm);

    }


    private void fuzhi(List<String>userFieldName,List userFiledValue,Map allRequstParam,Map allParam){
        userFieldName.add("userId");
        userFieldName.add("userNumber");
        userFieldName.add("password");
        userFieldName.add("roleId");
        userFieldName.add("class");
        userFieldName.add("userName");

        if(allRequstParam.containsKey("userId")){
            if(allRequstParam.get("userId")==""){
                userFiledValue.add("");
            }else {
                userFiledValue.add(allRequstParam.get("userId"));
            }
        }
        if(allRequstParam.containsKey("userNumber")){
            if(allRequstParam.get("userNumber")==""){
                userFiledValue.add("");
            }else {
                userFiledValue.add(allRequstParam.get("userNumber"));
            }
        }
        if(allRequstParam.containsKey("password")){
            if(allRequstParam.get("password")==""){
                userFiledValue.add("");
            }else {
                userFiledValue.add(allRequstParam.get("password"));
            }
        }
        if(allRequstParam.containsKey("roleId")){
            if(allRequstParam.get("roleId")==""){
                userFiledValue.add("");
            }else {
                userFiledValue.add(allRequstParam.get("roleId"));
            }
        }
        if(allRequstParam.containsKey("className")){
            if(allRequstParam.get("className")==""){
                userFiledValue.add("");
            }else {
                userFiledValue.add(allRequstParam.get("className"));
            }
        }
        if(allRequstParam.containsKey("userName")){
            if(allRequstParam.get("userName")==""){
                userFiledValue.add("");
            }else {
                userFiledValue.add(allRequstParam.get("userName"));
            }
        }
        allParam.put(userFieldName,userFiledValue);
    }

}
