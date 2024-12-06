package cn.tedu.jsd2307enjoymall.pojo.param;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserRegParam implements Serializable {
    private String username;
    private String password;
    private String nickname;
    private String phone;
    private String email;
}
