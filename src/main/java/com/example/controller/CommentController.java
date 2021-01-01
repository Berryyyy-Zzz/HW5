package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.entity.Comment;
import com.example.service.CommentService;
import com.example.util.Result;

@Controller
@RequestMapping("/comment")
public class CommentController {
	@Autowired
	private CommentService commentService;
	@RequestMapping("/findByLesson")
    @ResponseBody
    public List<Comment> findByLesson(int lesson_id) throws Exception{
        List<Comment> list = commentService.findByLesson(lesson_id);
        return list;
    }
	@RequestMapping("/addComment")
    @ResponseBody
    public Result addComment(Comment comment) throws Exception{
        Result result = new Result();
        if(commentService.addComment(comment)==1){
            result.setResult("success");
            result.setMessage("评论成功！");
        }else {
            result.setResult("error");
            result.setMessage("评论失败，请重试！");
        }
        return result;
    }
}
