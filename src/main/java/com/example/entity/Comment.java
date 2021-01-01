package com.example.entity;

import java.util.Date;

public class Comment {
	private int id;
	private int user_id;
	private String username;
	private String lesson_id;
	private String name;
	private String content;
	private Date time;
	private int reply_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getLesson_id() {
		return lesson_id;
	}
	public void setLesson_id(String lesson_id) {
		this.lesson_id = lesson_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public int getReply_id() {
		return reply_id;
	}
	public void setReply_id(int reply_id) {
		this.reply_id = reply_id;
	}
	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Comment(int id, int user_id, String username, String lesson_id, String name, String content, Date time,
			int reply_id) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.username = username;
		this.lesson_id = lesson_id;
		this.name = name;
		this.content = content;
		this.time = time;
		this.reply_id = reply_id;
	}
	
}
