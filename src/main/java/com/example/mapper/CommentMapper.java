package com.example.mapper;

import java.util.List;

import com.example.entity.Comment;

public interface CommentMapper {
	List<Comment> findByLesson(int lesson_id) throws Exception;
	int addComment(Comment comment) throws Exception;
}
