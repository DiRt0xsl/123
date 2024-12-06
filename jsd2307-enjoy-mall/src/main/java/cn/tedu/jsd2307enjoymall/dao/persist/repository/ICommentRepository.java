package cn.tedu.jsd2307enjoymall.dao.persist.repository;

import cn.tedu.jsd2307enjoymall.pojo.entity.Comment;
import cn.tedu.jsd2307enjoymall.pojo.param.CommentInfoParam;

public interface ICommentRepository {

    int insertNewComment(Comment comment);
}
