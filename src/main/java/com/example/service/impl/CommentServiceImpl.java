package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Comment;
import com.example.mapper.CommentMapper;
import com.example.service.CommentService;

@Service(value = "CommentService")
public class CommentServiceImpl implements CommentService{
	@Autowired
	private CommentMapper commentMapper;

	@Override
	public List<Comment> findByLesson(int lesson_id) throws Exception {
		// TODO Auto-generated method stub
		return commentMapper.findByLesson(lesson_id);
	}

	@Override
	public int addComment(Comment comment) throws Exception {
		// TODO Auto-generated method stub
		return commentMapper.addComment(comment);
	}
}
