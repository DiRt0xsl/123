package cn.tedu.jsd2307enjoymall.dao.persist.repository.impl;

import cn.tedu.jsd2307enjoymall.dao.persist.mapper.UserMapper;
import cn.tedu.jsd2307enjoymall.pojo.entity.User;
import cn.tedu.jsd2307enjoymall.pojo.vo.UserVO;
import cn.tedu.jsd2307enjoymall.dao.persist.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements IUserRepository {
    @Autowired
    UserMapper userMapper;

    @Override
    public UserVO selectByUsername(String username) {
        return userMapper.selectByUsername(username);
    }

    @Override
    public int insert(User user) {
        //System.out.println("user = " + user);
        return userMapper.insert(user);
    }
}
