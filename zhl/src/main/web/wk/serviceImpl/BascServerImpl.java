package wk.serviceImpl;

import com.mysql.jdbc.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wk.dao.yydjDao;
import wk.entity.*;
import wk.service.BascServer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: zhanghl
 * @Date: 2018/11/23 15:45
 */
@Service
public class BascServerImpl implements BascServer {

    @Autowired
    yydjDao yydjDao;
    public yydjresult getAllData(yydjParame yydjParame){

        yydjresult cunResult = new yydjresult();
        getYydjData(yydjParame,cunResult);
        if(yydjParame.getQlbsmList().size()==0){
            return cunResult;
        }

        return cunResult;

    }



    private void getYydjData(yydjParame yydjParame,yydjresult cunResult){
        List<yydjdjfz_dymx>  dymx =
                yydjDao.getyydjDymxshuj(yydjParame);
        List<String> allqlbsm;
        if(dymx.size()>0){
           cunResult.setYydjdjfz_dymx(dymx);
           if(yydjParame.getQlbsmList()==null){
               allqlbsm=dymx.stream().map(bsms->bsms.getQlbsm()).collect(Collectors.toList());
               yydjParame.setQlbsmList(allqlbsm);
           }

        }

        if(yydjParame.getQlbsmList().size()>0){
             List<yydj> yydj=
                     yydjDao.getyydjShuju(yydjParame);
             if(yydj.size()>0){
                 cunResult.setYydj(yydj);
             }
        }
        if(yydjParame.getQlbsmList().size()>0){
            List<yydj_dygx> yydj_dygx =
                    yydjDao.getyydjDygxshuj(yydjParame);
            if(yydj_dygx.size()>0){
                cunResult.setYydj_dygx(yydj_dygx);
            }
        }
        if(yydjParame.getQlbsmList().size()>0){
            List<yydj_zx> yydj_zx =
                    yydjDao.getyydjzxshuju(yydjParame);
            if(yydj_zx.size()>0){
                cunResult.setYydj_zx(yydj_zx);
            }
        }
        if(yydjParame.getQlbsmList().size()>0){
            List<yydjdfjz_djzm> djzm=
                    yydjDao.getyydjDjzmshuj(yydjParame);
            if(djzm.size()>0){
                cunResult.setYydjdfjz_djzm(djzm);
            }
        }




    }


}
