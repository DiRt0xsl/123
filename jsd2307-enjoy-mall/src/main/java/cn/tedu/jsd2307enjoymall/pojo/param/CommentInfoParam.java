package cn.tedu.jsd2307enjoymall.pojo.param;

import lombok.Data;

import java.io.Serializable;

@Data
public class CommentInfoParam implements Serializable {

    private String content;
    private Long userId;
    private Long contentId;
}
