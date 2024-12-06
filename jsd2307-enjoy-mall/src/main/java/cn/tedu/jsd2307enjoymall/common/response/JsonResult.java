package cn.tedu.jsd2307enjoymall.common.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
    common.response.JsonResult:统一响应结果的类
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class JsonResult {
    //内部状态码
    private Integer code;
    //提示消息
    private String msg;
    //具体数据
    private Object data;

    /**
     * 第1个构造方法:针对于没有具体数据data返回的控制器方法
     */
    public JsonResult(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * 第2个构造方法:针对于没有具体数据data返回的控制器方法
     */
    public JsonResult(StatusCode statusCode){
        this.code = statusCode.getCode();
        this.msg = statusCode.getMsg();
    }

    /**
     * 第3个构造方法:针对于有具体数据data返回的控制器方法
     */
    public JsonResult(StatusCode statusCode, Object data){
        //this(statusCode);
        this.code = statusCode.getCode();
        this.msg = statusCode.getMsg();
        this.data = data;
    }

    /**
     * 静态方法1:用于快速构建JsonResult对象
     * 针对于操作成功OPERATION_SUCCESS的业务场景
     * 有具体数据返回的场景;
     */
    public static JsonResult ok(Object data){
        return new JsonResult(StatusCode.SUCCESS, data);
    }

    /**
     * 静态方法2:用于快速构建JsonResult对象
     * 针对于操作成功OPERATION_SUCCESS的业务场景
     * 没有具体数据返回的场景;
     */
    public static JsonResult ok(){
        return ok(null);
    }

}









