package wk.serviceImpl;

import org.springframework.stereotype.Service;
import wk.entity.shEntity;
import wk.entity.user;
import wk.service.parameterEvaluation;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/8/29.
 */
@Service(value = "getShEntiry")
public class parameterEvaluationImpl implements parameterEvaluation {

      @Override
      public List<shEntity> getshEntity(Map<String, String> allRequestParam, shEntity sh) {
            if (allRequestParam.containsKey("bsm") && !allRequestParam.get("bsm").equals("")) {
                  sh.setBsm(String.valueOf(allRequestParam.get("bsm")));
            }
            if (allRequestParam.containsKey("ywh") && !allRequestParam.get("ywh").equals("")) {
                  sh.setYwh(String.valueOf(allRequestParam.get("ywh")));
            }
            if (allRequestParam.containsKey("qlbm") && !allRequestParam.get("qlbm").equals("")) {
                  sh.setQlbm(String.valueOf(allRequestParam.get("qlbm")));
            }
            if (allRequestParam.containsKey("qlbsm") && !allRequestParam.get("qlbsm").equals("")) {
                  sh.setQlbsm(String.valueOf(allRequestParam.get("qlbsm")));
            }
            if (allRequestParam.containsKey("lcdm") && !allRequestParam.get("	lcdm").equals("")) {
                  sh.setLcdm(String.valueOf(allRequestParam.get("lcdm")));
            }
            if (allRequestParam.containsKey("shlx") && !allRequestParam.get("	shlx").equals("")) {
                  sh.setShlx(String.valueOf(allRequestParam.get("shlx")));
            }
            if (allRequestParam.containsKey("qllx") && !allRequestParam.get("qllx").equals("")) {
                  sh.setQllx(String.valueOf(allRequestParam.get("qllx")));
            }
            if (allRequestParam.containsKey("djlx") && !allRequestParam.get("djlx").equals("")) {
                  sh.setDjlx(String.valueOf(allRequestParam.get("djlx")));
            }
            if (allRequestParam.containsKey("qlrmc") && !allRequestParam.get("qlrmc").equals("")) {
                  sh.setQlrmc(String.valueOf(allRequestParam.get("qlrmc")));
            }
            if (allRequestParam.containsKey("qlrtxdz") && !allRequestParam.get("qlrtxdz").equals("")) {
                  sh.setQlrtxdz(String.valueOf(allRequestParam.get("qlrtxdz")));
            }
            if (allRequestParam.containsKey("ywrdljg") && !allRequestParam.get("ywrdljg").equals("")) {
                  sh.setYwrdljg(String.valueOf(allRequestParam.get("ywrdljg")));
            }
            if (allRequestParam.containsKey("bdcdyh") && !allRequestParam.get("bdcdyh").equals("")) {
                  sh.setBdcdyh(String.valueOf(allRequestParam.get("bdcdyh")));
            }
            if (allRequestParam.containsKey("zl") && !allRequestParam.get("zl").equals("")) {
                  sh.setZl(String.valueOf(allRequestParam.get("zl")));
            }
            if (allRequestParam.containsKey("slr") && !allRequestParam.get("slr").equals("")) {
                  sh.setSlr(String.valueOf(allRequestParam.get("slr")));
            }
            if (allRequestParam.containsKey("slsj") && !allRequestParam.get("slsj").equals("")) {
                  sh.setSlsj(String.valueOf(allRequestParam.get("slsj")));
            }
            if (allRequestParam.containsKey("slyj") && !allRequestParam.get("slyj").equals("")) {
                  sh.setSlyj(String.valueOf(allRequestParam.get("slyj")));
            }
            if (allRequestParam.containsKey("slrsgzh") && !allRequestParam.get("slrsgzh").equals("")) {
                  sh.setSlrsgzh(String.valueOf(allRequestParam.get("slrsgzh")));
            }
            if (allRequestParam.containsKey("slrbsm") && !allRequestParam.get("slrbsm").equals("")) {
                  sh.setSlrbsm(String.valueOf(allRequestParam.get("slrbsm")));
            }
            if (allRequestParam.containsKey("csr") && !allRequestParam.get("csr").equals("")) {
                  sh.setCsr(String.valueOf(allRequestParam.get("csr")));
            }
            if (allRequestParam.containsKey("csrsgzh") && !allRequestParam.get("csrsgzh").equals("")) {
                  sh.setCsrsgzh(String.valueOf(allRequestParam.get("slrsgzh")));
            }
            if (allRequestParam.containsKey("csrbsm") && !allRequestParam.get("csrbsm").equals("")) {
                  sh.setCsrbsm(String.valueOf(allRequestParam.get("csrbsm")));
            }
            if (allRequestParam.containsKey("csyj") && !allRequestParam.get("csyj").equals("")) {
                  sh.setCsyj(String.valueOf(allRequestParam.get("csyj")));
            }
            if (allRequestParam.containsKey("cssj") && !allRequestParam.get("cssj").equals("")) {
                  sh.setCssj(String.valueOf(allRequestParam.get("cssj")));
            }
            if (allRequestParam.containsKey("fsr") && !allRequestParam.get("fsr").equals("")) {
                  sh.setFsr(String.valueOf(allRequestParam.get("fsr")));
            }
            if (allRequestParam.containsKey("fsrsgzh") && !allRequestParam.get("fsrsgzh").equals("")) {
                  sh.setFsrsgzh(String.valueOf(allRequestParam.get("fsrsgzh")));
            }
            if (allRequestParam.containsKey("fsrbsm") && !allRequestParam.get("fsrbsm").equals("")) {
                  sh.setFsrbsm(String.valueOf(allRequestParam.get("fsrbsm")));
            }
            if (allRequestParam.containsKey("fsyj") && !allRequestParam.get("fsyj").equals("")) {
                  sh.setFsyj(String.valueOf(allRequestParam.get("fsyj")));
            }
            if (allRequestParam.containsKey("fssj") && !allRequestParam.get("fssj").equals("")) {
                  sh.setFssj(String.valueOf(allRequestParam.get("fssj")));
            }
            if (allRequestParam.containsKey("islike") && !allRequestParam.get("islike").equals("")) {
                  sh.setIslike(String.valueOf(allRequestParam.get("islike")));
            }
            if (allRequestParam.containsKey("hdr") && !allRequestParam.get("hdr").equals("")) {
            }
            if (allRequestParam.containsKey("hdrsgzh") && !allRequestParam.get("hdrsgzh").equals("")) {
            }
            if (allRequestParam.containsKey("hdrbsm") && !allRequestParam.get("hdrbsm").equals("")) {
            }
            if (allRequestParam.containsKey("hdyj") && !allRequestParam.get("hdyj").equals("")) {
            }
            if (allRequestParam.containsKey("hdsj") && !allRequestParam.get("hdsj").equals("")) {
            }
            if (allRequestParam.containsKey("dbr") && !allRequestParam.get("dbr").equals("")) {
            }
            if (allRequestParam.containsKey("yxtbm") && !allRequestParam.get("yxtbm").equals("")) {
            }
            if (allRequestParam.containsKey("yxtbsm") && !allRequestParam.get("yxtbsm").equals("")) {
            }
            if (allRequestParam.containsKey("qxdm") && !allRequestParam.get("qxdm").equals("")) {
            }
            if (allRequestParam.containsKey("rev_") && !allRequestParam.get("rev_").equals("")) {
            }
            if (allRequestParam.containsKey("bz_yzdqlrid") && !allRequestParam.get("bz_yzdqlrid").equals("")) {
            }
            if (allRequestParam.containsKey("bz_add1") && !allRequestParam.get("bz_add1").equals("")) {
            }
            if (allRequestParam.containsKey("bz_zdqlr_id") && !allRequestParam.get("bz_zdqlr_id").equals("")) {
            }
            if (allRequestParam.containsKey("gxsj") && !allRequestParam.get("gxsj").equals("")) {
            }


            return null;
      }


      @Override
      public void getcsAdd(Map<String, String> allRequestParam, user user) {
            if (allRequestParam.containsKey("userId") && !allRequestParam.get("userId").equals("")) {
                  user.setUserId(String.valueOf(allRequestParam.get("userId")));
            }
            if (allRequestParam.containsKey("userNumber") && !allRequestParam.get("userNumber").equals("")) {
                  user.setUserNumber(String.valueOf(allRequestParam.get("userNumber")));
            }
            if (allRequestParam.containsKey("password") && !allRequestParam.get("password").equals("")) {
                  user.setPassword(String.valueOf(allRequestParam.get("password")));
            }
            if (allRequestParam.containsKey("roleId") && !allRequestParam.get("roleId").equals("")) {
                  user.setRoleId(String.valueOf(allRequestParam.get("roleId")));
            }
            if (allRequestParam.containsKey("classId") && !allRequestParam.get("classId").equals("")) {
                  user.setClassId(String.valueOf(allRequestParam.get("classId")));
            }
            user.setClassId("9");
            if (allRequestParam.containsKey("userName") && !allRequestParam.get("userName").equals("")) {
                  user.setUserName(String.valueOf(allRequestParam.get("userName")));
            }
      }

}