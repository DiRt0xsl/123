package cn.tedu.jsd2307enjoymall.service.impl;

import cn.tedu.jsd2307enjoymall.dao.persist.repository.ICommentRepository;
import cn.tedu.jsd2307enjoymall.pojo.entity.Comment;
import cn.tedu.jsd2307enjoymall.pojo.param.CommentInfoParam;
import cn.tedu.jsd2307enjoymall.service.ICommentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CommentServiceImpl implements ICommentService {

    @Autowired
    private ICommentRepository commentRepository;

    @Override
    public void insertNewComment(CommentInfoParam commentInfoParam) {

        Comment comment = new Comment();
        BeanUtils.copyProperties(commentInfoParam,comment);
        commentRepository.insertNewComment(comment);

    }
}
