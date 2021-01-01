package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Lesson;
import com.example.mapper.LessonMapper;
import com.example.service.LessonService;
@Service(value = "LessonService")
public class LessonServiceImpl implements LessonService{
	@Autowired
	private LessonMapper lessonMapper;

	@Override
	public List<Lesson> findAll() throws Exception {
		// TODO Auto-generated method stub
		return lessonMapper.findAll();
	}

	@Override
	public List<Lesson> findByName(String name) throws Exception {
		// TODO Auto-generated method stub
		return lessonMapper.findByName(name);
	}

	@Override
	public List<Lesson> findByType(String type) throws Exception {
		// TODO Auto-generated method stub
		return lessonMapper.findByType(type);
	}

	@Override
	public Lesson findLesson(int id) throws Exception {
		// TODO Auto-generated method stub
		return lessonMapper.findLesson(id);
	}

	@Override
	public List<Lesson> findMyLesson(int user_id) throws Exception {
		// TODO Auto-generated method stub
		return lessonMapper.findMyLesson(user_id);
	}

	@Override
	public int addCollection(int user_id, int lesson_id) throws Exception {
		// TODO Auto-generated method stub
		return lessonMapper.addCollection(user_id, lesson_id);
	}

	@Override
	public String isCollection(int user_id, int lesson_id) throws Exception {
		// TODO Auto-generated method stub
		return lessonMapper.isCollection(user_id, lesson_id);
	}
}
