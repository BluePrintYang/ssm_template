package top.yll.ssm;

import org.junit.Test;
import top.yll.ssm.dao.UserDao;
import top.yll.ssm.model.User;

import javax.annotation.Resource;
import java.util.List;

public class UserDaoTest extends BaseJunit4Test{

    @Resource
    private UserDao userDao;

    @Test
    public void testFindAll(){
        List<User> userList = userDao.findAll();
        System.out.println(userList.size());
    }
}
