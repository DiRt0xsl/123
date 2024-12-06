package cn.tedu.jsd2307enjoymall.dao.persist.repository.impl;

import cn.tedu.jsd2307enjoymall.dao.persist.mapper.CommentMapper;
import cn.tedu.jsd2307enjoymall.dao.persist.repository.ICommentRepository;
import cn.tedu.jsd2307enjoymall.pojo.entity.Comment;
import cn.tedu.jsd2307enjoymall.pojo.param.CommentInfoParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CommentRepositoryImpl implements ICommentRepository{

    @Autowired
    private CommentMapper commentMapper;

    @Override
    public int insertNewComment(Comment comment) {
        return commentMapper.insert(comment);
    }
}
