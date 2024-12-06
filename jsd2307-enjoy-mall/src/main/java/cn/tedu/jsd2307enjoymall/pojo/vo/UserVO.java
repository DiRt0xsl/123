package cn.tedu.jsd2307enjoymall.pojo.vo;




import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class UserVO implements Serializable {

    private Integer id;

    private String username;

    private String password;

    private String nickname;

    private String imgUrl;

    private Integer isAdmin;


}
