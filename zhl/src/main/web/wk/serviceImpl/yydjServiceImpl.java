package wk.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wk.dao.yydjDao;
import wk.entity.yydjParame;
import wk.entity.yydjresult;
import wk.service.yydjService;

import java.util.List;

/**
 * @Author: zhanghl
 * @Date: 2018/11/16 16:02
 */
@Service
public class yydjServiceImpl implements yydjService {

    @Autowired
    yydjDao yydjDao;


    public List<yydjresult> getYydj(yydjParame yydjParame){


        return null;
    }
}
