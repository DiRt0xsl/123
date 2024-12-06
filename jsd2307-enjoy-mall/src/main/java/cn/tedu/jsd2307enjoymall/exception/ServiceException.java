package cn.tedu.jsd2307enjoymall.exception;

import cn.tedu.jsd2307enjoymall.common.response.StatusCode;
import lombok.Getter;

public class ServiceException extends RuntimeException {
    @Getter
    private StatusCode statusCode;

    public ServiceException(StatusCode statusCode){

        this.statusCode=statusCode;
    }
}
