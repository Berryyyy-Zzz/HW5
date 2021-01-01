package com.example.mapper;

import java.util.List;

import com.example.entity.Lesson;

public interface LessonMapper {
	List<Lesson> findAll() throws Exception;
	List<Lesson> findByName(String name) throws Exception;
	List<Lesson> findByType(String type) throws Exception;
	Lesson findLesson(int id) throws Exception;
	List<Lesson> findMyLesson(int user_id) throws Exception;
	int addCollection(int user_id, int lesson_id) throws Exception;
	String isCollection(int user_id,int lesson_id) throws Exception;
}
