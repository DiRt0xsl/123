package cn.tedu.jsd2307enjoymall.pojo.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@TableName("t_comment")
public class Comment implements Serializable {
    @TableId(type = IdType.AUTO)
    private Long id;

    private String content;
    private Long userId;
    private Long contentId;

    //@JsonFormat(pattern = "yyyy/MM/dd", timezone = "GMT+8")
   @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

   @TableField(fill = FieldFill.INSERT_UPDATE)
   private LocalDateTime updateTime;
}
