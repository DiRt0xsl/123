package cn.tedu.jsd2307enjoymall.mybatis;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class TimeMetaObjectHandler implements MetaObjectHandler {

    public static final String FIELD_CREATE_TIME = "createTime";
    public static final String FIELD_UPDATE_TIME = "updateTime";

    @Override
    public void insertFill(MetaObject metaObject) {
        LocalDateTime now = LocalDateTime.now();
        this.setFieldValByName(FIELD_CREATE_TIME, now, metaObject);
        this.setFieldValByName(FIELD_UPDATE_TIME, now, metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        LocalDateTime now = LocalDateTime.now();
        this.setFieldValByName(FIELD_UPDATE_TIME, now, metaObject);
    }

}