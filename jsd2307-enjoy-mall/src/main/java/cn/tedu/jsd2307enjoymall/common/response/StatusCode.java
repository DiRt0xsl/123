package cn.tedu.jsd2307enjoymall.common.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum StatusCode {
    //所有的实例都放在最上面
    SUCCESS(1, "ok"),
    NOT_LOGIN(1000, "未登录"),
    LOGIN_SUCCESS(1001, "登录成功"),
    PASSWORD_ERROR(1002, "密码错误"),
    USERNAME_ERROR(1003, "用户名错误"),
    USERNAME_ALREADY_EXISTS(1004, "用户名被占用"),
    OPERATION_SUCCESS(2001, "操作成功"),
    OPERATION_FAILED(2002, "操作失败"),
    VALIDATED_ERROR(3002, "参数校验失败");
    //内部状态码,提示消息
    private Integer code;
    private String msg;
}








