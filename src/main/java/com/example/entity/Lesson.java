package com.example.entity;

import java.util.Date;

public class Lesson {
	private int id;
	private String name;
	private String teacher;
	private String type;
	private String content;
	private String video;
	private Date time;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getVideo() {
		return video;
	}
	public void setVideo(String video) {
		this.video = video;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public Lesson() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Lesson(int id, String name, String teacher, String type, String content, String video, Date time) {
		super();
		this.id = id;
		this.name = name;
		this.teacher = teacher;
		this.type = type;
		this.content = content;
		this.video = video;
		this.time = time;
	}
	
}
