package cn.tedu.jsd2307enjoymall.commentTests;

import cn.tedu.jsd2307enjoymall.pojo.entity.Comment;
import cn.tedu.jsd2307enjoymall.pojo.param.CommentInfoParam;
import cn.tedu.jsd2307enjoymall.service.ICommentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.Date;

@SpringBootTest
public class AddCommentTests {

    @Autowired
    ICommentService service;

    @Test
    void addComment(){
        CommentInfoParam commentInfoParam = new CommentInfoParam();
        commentInfoParam.setUserId(1L);
        commentInfoParam.setContent("hahahah");
        commentInfoParam.setContentId(2L);
        Comment comment = new Comment();
        BeanUtils.copyProperties(commentInfoParam,comment);
        service.insertNewComment(commentInfoParam);
    }
}
