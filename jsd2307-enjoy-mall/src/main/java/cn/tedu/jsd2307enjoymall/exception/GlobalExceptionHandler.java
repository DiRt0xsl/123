package cn.tedu.jsd2307enjoymall.exception;

import cn.tedu.jsd2307enjoymall.common.response.JsonResult;
import cn.tedu.jsd2307enjoymall.common.response.StatusCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler
    public JsonResult doHandleServiceException(ServiceException ex){
        log.error(ex.getStatusCode().getMsg());//输出错误日志
        //把抛出异常对象时装进去的StatusCode取出来，装进JsonResult里面响应给客户端
        return new JsonResult(ex.getStatusCode());
    }

    /*
     * ExceptionHandler注解：
     * 标识才方法为异常处理方法；
     * 如果控制器抛出了异常，检查全局异常处理器中的每个异常处理方法；
     * */
    @ExceptionHandler
    public JsonResult doHandleRuntimeException(RuntimeException ex){
        String message = ex.getMessage();
        log.error("父类："+message);
        return new JsonResult(StatusCode.OPERATION_FAILED,message);
    }

    @ExceptionHandler
    public JsonResult d0HandleIllegalArgumentException(IllegalArgumentException ie){
        String message = ie.getMessage();
        log.error("子类："+message);
        return new JsonResult(StatusCode.OPERATION_FAILED,message);
    }

    @ExceptionHandler
    public JsonResult doMethodArgumentNotValidException(MethodArgumentNotValidException ex){
        String message = ex.getFieldError().getDefaultMessage();
        return new JsonResult(StatusCode.VALIDATED_ERROR,message);

    }


    /*
     * 1、能够处理所有异常
     * 2、没有任何异常处理方法去处理异常时，则使用此方法处理
     * 3、一般在最后时刻添加此异常处理方法
     * */
   /* @ExceptionHandler
    public JsonResult doHandleThrowable(Throwable ex){

        return new JsonResult(8888,"程序运行时出现了Throwable异常");
    }*/
}