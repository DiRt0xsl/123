package cn.tedu.jsd2307enjoymall.dao.persist.mapper;

import cn.tedu.jsd2307enjoymall.pojo.entity.User;
import cn.tedu.jsd2307enjoymall.pojo.vo.UserVO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<User> {

    int insert(User user);

    UserVO selectByUsername(String username);

}
