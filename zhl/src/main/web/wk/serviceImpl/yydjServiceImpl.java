package wk.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wk.entity.*;
import wk.service.BascServer;
import wk.service.yydjService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: zhanghl
 * @Date: 2018/11/16 16:02
 */
@Service
public class yydjServiceImpl implements yydjService {

    @Autowired
    BascServer bascServer;



    public List<yydjActionResult> getYydj(yydjParame yydjParame){
        yydjresult result =
                bascServer.getAllData(yydjParame);

        List<yydjActionResult> finalResult = new ArrayList<>();
        List<yydjdjfz_dymx> dymxList=
                result.getYydjdjfz_dymx();

        dymxList.stream().forEach(dymx->{
            HouseAndLandUtils houseAndLandUtils = new HouseAndLandUtils<>();
            yydjActionResult yydjresult= new yydjActionResult();
            yydjresult.setYydj(new yydj());
            yydjresult.setYydj_dygx(new yydj_dygx());
            yydjresult.setYydj_zx(new yydj_zx());
            yydjresult.setYydjdfjz_djzm(new yydjdfjz_djzm());
            yydjresult.setYydjdjfz_dymx(new yydjdjfz_dymx());

            String[] stringColumns = new String[]{};
            //通过反射加载数据
            ReflectUtils.reflectTransferProperty(dymx,yydjresult.getYydjdjfz_dymx(),stringColumns);
            String qlbsm = dymx.getQlbsm();
            String dybsm = dymx.getDybsm();
            Map<String,Object> mapParam = new HashMap<>();
            mapParam.put("qlbsm",qlbsm);
            mapParam.put("dybsm",dybsm);
            Map<String,List> mapData = getEasementInfo(houseAndLandUtils,result ,mapParam);
            if(mapData==null){
                return;
            }
            finalResult.add(getDiseentJoin_Base(houseAndLandUtils,yydjresult,mapData));





        });
        return finalResult;
    }

    /**
     * 获取相关信息
     * @param houseAndLandUtils
     * @param integratedQueryResultEntity
     * @param mapParams
     * @return
     */
    private Map<String,List> getEasementInfo(HouseAndLandUtils houseAndLandUtils,
                                         yydjresult integratedQueryResultEntity,
                                         Map<String,Object> mapParams){
        //证明信息
        List<yydjdfjz_djzm> certiProveEntityVoList =
                houseAndLandUtils.getFilterValue(integratedQueryResultEntity.getYydjdfjz_djzm(), "qlbsm",mapParams.get("qlbsm"));
        if(certiProveEntityVoList.size()<=0) {
            return null;
        }

        //异议登记信息
        List<yydj> diseentsEntityVoList =
                houseAndLandUtils.getFilterValue(integratedQueryResultEntity.getYydj(), "bsm",String.valueOf(mapParams.get("qlbsm")));

        if(diseentsEntityVoList.size()<=0) {
            return null;
        }

        //异议登记单元关系
        List<yydj> diseentUnitEntityVoList =
                houseAndLandUtils.getFilterValue(integratedQueryResultEntity.getYydj_dygx(), "dybsm",String.valueOf(mapParams.get("dybsm")));

        if(diseentUnitEntityVoList.size()<=0) {
            return null;
        }

        List<yydj_zx> undisenntEntityVoList = new ArrayList<>();
        if(integratedQueryResultEntity.getYydj_zx() !=null &&integratedQueryResultEntity.getYydj_zx().size() > 0){
            //异议登记注销注销
            undisenntEntityVoList =
                    houseAndLandUtils.getFilterValue(integratedQueryResultEntity.getYydj_zx(), "yydjbsm", String.valueOf(mapParams.get("qlbsm")));
            if(undisenntEntityVoList.size()<=0) {
                return null;
            }
        }
        Map<String,List> map =new HashMap<>();

        map.put("CERTIPROVE",certiProveEntityVoList);//证明
        map.put("YYDJ",diseentsEntityVoList);//异议登记
        map.put("YYDJ_ZX",undisenntEntityVoList);//异议登记注销
        map.put("YYDJ_DYGX",diseentUnitEntityVoList);//异议登记单元关系

        return map;

    }

    /**
     * 加载组合后的信息
     * @param houseAndLandUtils
     * @param integratedDiseentResultJoin
     * @param mapData
     * @return
     */
    private yydjActionResult getDiseentJoin_Base(HouseAndLandUtils houseAndLandUtils,yydjActionResult integratedDiseentResultJoin,Map<String,List> mapData){
        //证书或证明信息
        String[] strCertiProveJoinColumns = new String[]{};
        houseAndLandUtils.getJoinValue(integratedDiseentResultJoin.getYydjdfjz_djzm(),strCertiProveJoinColumns,mapData.get("CERTIPROVE"));

        //异议登记信息
        String[] strPledgeeJoinColumns = new String[]{};
        houseAndLandUtils.getJoinValue(integratedDiseentResultJoin.getYydj(),strPledgeeJoinColumns, mapData.get("YYDJ"));

        //异议登记单元关系
        String[] strPledgeUnitJoinColumns = new String[]{};
        houseAndLandUtils.getJoinValue(integratedDiseentResultJoin.getYydj_dygx(),strPledgeUnitJoinColumns, mapData.get("YYDJ_DYGX"));

        //异议登记注销信息
        String[] strUnPledgeJoinColumns = new String[]{};//YYDJ_ZX
        if(mapData.get("YYDJ_ZX").size()>0){
            houseAndLandUtils.getJoinValue(integratedDiseentResultJoin.getYydj_zx(),strUnPledgeJoinColumns, mapData.get("YYDJ_ZX"));
        }

        return  integratedDiseentResultJoin;
    }

}
