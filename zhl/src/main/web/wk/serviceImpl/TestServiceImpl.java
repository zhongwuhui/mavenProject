package wk.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wk.dao.TestDao;
import wk.entity.shEntity;
import wk.entity.user;
import wk.service.TestService;
import wk.dao.Simple;

import java.util.List;

/**
 * Created by 张虎龙 on 2018/8/12.
 */
@Service("testService")
public class TestServiceImpl  implements TestService {
    @Autowired(required = false)
    private TestDao testDao;

    /**
     * 测试用用
     * @return
     */
    @Override
    public int testAction() {
          System.out.println("进入了service");
        int i = testDao.selectCount();
        System.out.println("出了service");
        return i;
    }

    /**
     * 得到用户登录信息
     * @param user
     * @return
     */
    @Override
    public List<user> login(user user){
        List<user> message=testDao.selecusermessage(user);
        return message;
    }

    /**
     * 得到审核表信息
     * @param shEntity
     * @return
     */
    @Override
    public List<shEntity>  shcheckServer(shEntity shEntity){
       List<shEntity> shmessage=testDao.selectShMessage(shEntity);
        System.out.println();
        return  shmessage;
    }

    @Override
    public String insertShmessage(shEntity shEntity){
        String bsm=testDao.insertShmessage(shEntity);
        return bsm;
    }




}


