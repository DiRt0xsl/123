package cn.tedu.jsd2307enjoymall.pojo.param;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserLoginParam implements Serializable {

    private String username;

    private String password;
}
