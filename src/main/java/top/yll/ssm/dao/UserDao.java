package top.yll.ssm.dao;

import org.springframework.stereotype.Repository;
import top.yll.ssm.model.User;

import java.util.List;

@Repository
public interface UserDao {

    List<User> findAll();
}
