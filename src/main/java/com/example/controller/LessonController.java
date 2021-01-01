package com.example.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.entity.Lesson;
import com.example.service.LessonService;
import com.example.util.Result;

@Controller
@RequestMapping("/lesson")
public class LessonController {
	@Autowired
	private LessonService lessonService;
	@RequestMapping("/findAll")
    @ResponseBody
    public List<Lesson> findAll() throws Exception{
        List<Lesson> list = lessonService.findAll();
        return list;
    }
	@RequestMapping("/findByName")
    @ResponseBody
    public List<Lesson> findByName(String name) throws Exception{
        List<Lesson> list = lessonService.findByName(name);
        return list;
    }
	@RequestMapping("/findByType")
    @ResponseBody
    public List<Lesson> findByType(String type) throws Exception{
        List<Lesson> list = lessonService.findByType(type);
        return list;
    }
	@RequestMapping("/findLesson")
    @ResponseBody
    public Lesson findLesson(int id) throws Exception{
        Lesson lesson = lessonService.findLesson(id);
        return lesson;
    }
	@RequestMapping("/download")
	public void download(HttpServletResponse response,String name,int id) throws Exception{
		// 文件地址，真实环境是存放在数据库中的
		File file = new File("D:\\file\\"+id+".zip");
		// 穿件输入对象
		FileInputStream fis = new FileInputStream(file);
		// 设置相关格式
		response.setContentType("application/force-download");
		// 设置下载后的文件名以及header
		System.out.println(name);
		response.addHeader("Content-disposition", "attachment;fileName=" +URLEncoder.encode(name,"utf-8")+".zip");
		// 创建输出对象
		OutputStream os = response.getOutputStream();
		// 常规操作
		byte[] buf = new byte[1024];
		int len = 0;
		while((len = fis.read(buf)) != -1) {
			os.write(buf, 0, len);
		}
		fis.close();
	}
	@RequestMapping("/findMyLesson")
	@ResponseBody
	public List<Lesson> findMyLesson(int user_id) throws Exception{
		List<Lesson> list = lessonService.findMyLesson(user_id);
		return list;
	}
	@RequestMapping("/addCollection")
	@ResponseBody
	public Result addCollection(int user_id, int lesson_id) throws Exception{
		Result result = new Result();
		if(lessonService.addCollection(user_id, lesson_id)==1) {
			result.setResult("success");
			result.setMessage("收藏成功！");
		}else {
			result.setResult("error");
			result.setMessage("收藏失败，请重试！");
		}
		return result;
	}
	@RequestMapping("/isCollection")
	@ResponseBody
	public Result isCollection(int user_id , int lesson_id) throws Exception {
		Result result = new Result();
		if(lessonService.isCollection(user_id, lesson_id)!=null) {
			result.setResult("success");
		}else {
			result.setResult("error");
		}
		return result;
	
	}
}
