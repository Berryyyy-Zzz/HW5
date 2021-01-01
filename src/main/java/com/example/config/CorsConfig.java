package com.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//忽略前端请求时丢失的请求头
@Configuration
public class CorsConfig implements WebMvcConfigurer {
	
	private String videoPath = "D:/video/";
	private String imgPath = "D:/img/";

	@Override
	public void addCorsMappings(CorsRegistry registry) {

		registry.addMapping("/**")
		
				.allowedOriginPatterns("*")

				.allowCredentials(true)

				.allowedMethods("GET", "POST", "DELETE", "PUT")

				.maxAge(3600);

	}


    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
 
        // 注意如果filePath是写死在这里，一定不要忘记尾部的/或者\\，这样才能读取其目录下的文件
        registry.addResourceHandler("/**").addResourceLocations(
        		"classpath:/templates/",
                "classpath:/META-INF/resources/",
                "classpath:/resources/",
                "classpath:/static/",
                "classpath:/public/",
                "classpath:/webapp/");
        registry.addResourceHandler("/video/**").addResourceLocations("file:/"+videoPath);
        registry.addResourceHandler("/img/**").addResourceLocations("file:/"+imgPath);
    }
}

