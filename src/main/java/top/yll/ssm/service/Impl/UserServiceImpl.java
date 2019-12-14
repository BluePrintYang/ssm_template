package top.yll.ssm.service.Impl;

import org.springframework.stereotype.Service;
import top.yll.ssm.dao.UserDao;
import top.yll.ssm.model.User;
import top.yll.ssm.service.UserService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
