package cn.tedu.jsd2307enjoymall.dao.persist.repository;

import cn.tedu.jsd2307enjoymall.pojo.entity.User;
import cn.tedu.jsd2307enjoymall.pojo.vo.UserVO;

public interface IUserRepository {

    UserVO selectByUsername(String username);

    int insert(User user);
}
