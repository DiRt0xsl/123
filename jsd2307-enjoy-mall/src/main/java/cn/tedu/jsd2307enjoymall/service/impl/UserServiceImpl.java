package cn.tedu.jsd2307enjoymall.service.impl;

import cn.tedu.jsd2307enjoymall.common.response.StatusCode;
import cn.tedu.jsd2307enjoymall.exception.ServiceException;
import cn.tedu.jsd2307enjoymall.pojo.param.UserLoginParam;
import cn.tedu.jsd2307enjoymall.pojo.param.UserRegParam;
import cn.tedu.jsd2307enjoymall.pojo.entity.User;
import cn.tedu.jsd2307enjoymall.pojo.vo.UserVO;
import cn.tedu.jsd2307enjoymall.dao.persist.repository.impl.UserRepositoryImpl;
import cn.tedu.jsd2307enjoymall.service.IUserService;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Date;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserRepositoryImpl userRepository;

    @Override
    public void reg(UserRegParam userRegDTO) {

        // 通过用户名查询用户名是否重复
        UserVO userVO = userRepository.selectByUsername(userRegDTO.getUsername());
        // System.out.println(userRegDTO.getUsername());
        if (userVO != null){//用户名重复
            throw new ServiceException(StatusCode.USERNAME_ALREADY_EXISTS);
        }
        User user = new User();
        BeanUtils.copyProperties(userRegDTO,user);

        //user.setCreateTime(new Date());
        //user.setPhone("111111");
        // System.out.println("user = " + user);

        // 将用户注册信息添加
        userRepository.insert(user);

    }

    @Override
    public UserVO login(UserLoginParam userLoginDTO) {
        //通过查询用户名判断用户是否存在
        UserVO userVO = userRepository.selectByUsername(userLoginDTO.getUsername());
        if (userVO == null){//用户名不存在
            throw new ServiceException(StatusCode.USERNAME_ERROR);
        }
        if (!userVO.getPassword().equals(userLoginDTO.getPassword())){
            throw new ServiceException(StatusCode.PASSWORD_ERROR);
        }
        return userVO;
    }
}
