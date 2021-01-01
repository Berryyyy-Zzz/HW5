
package com.example.controller;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
@Controller
public class FileUploadController {
	private String filePath = "D:/img/";
	

@RequestMapping("/upload")
@ResponseBody
public String update(@RequestParam("file") MultipartFile multipartFile) {
	String src = "";
	try {
		String uuid = UUID.randomUUID().toString().replaceAll("-", "");
		// 保存图片
		String fileName = multipartFile.getOriginalFilename();
		String suffixName = fileName.substring(fileName.lastIndexOf(".") + 1).toLowerCase();
		String newFileName = uuid+"."+suffixName;
		File file = new File(filePath + newFileName);
		multipartFile.transferTo(file);
		src = "img/"+newFileName;
		
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	return src;
}
}
