package cn.tedu.jsd2307enjoymall.service;

import cn.tedu.jsd2307enjoymall.pojo.param.UserLoginParam;
import cn.tedu.jsd2307enjoymall.pojo.param.UserRegParam;
import cn.tedu.jsd2307enjoymall.pojo.vo.UserVO;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IUserService {

    void reg(UserRegParam userRegDTO);

    UserVO login(UserLoginParam userLoginDTO);
}
