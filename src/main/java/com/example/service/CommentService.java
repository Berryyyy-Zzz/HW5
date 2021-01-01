package com.example.service;

import java.util.List;


import com.example.entity.Comment;

public interface CommentService {
	List<Comment> findByLesson(int lesson_id) throws Exception;
	int addComment(Comment comment) throws Exception;
}
