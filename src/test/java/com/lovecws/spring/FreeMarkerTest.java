package com.lovecws.spring;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.lovecws.spring.entity.User;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;

public class FreeMarkerTest {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.setDefaultEncoding("UTF-8");
		cfg.setClassForTemplateLoading(FreeMarkerTest.class, "");
		cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
		
		Map<String, Object> root = new HashMap<String, Object>();
		User user = new User();
		user.setUsername("zhangsan");
		user.setPassword("1234");
		List<User> users = new ArrayList<User>();
		users.add(user);
		root.put("users", users);
		
		try {
			Template template = cfg.getTemplate("index.ftl");

			Writer out = new OutputStreamWriter(System.out);

			template.process(root, out);

			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (TemplateException e) {
			e.printStackTrace();
		}
	}
}
