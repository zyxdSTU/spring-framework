package com.zy.zhihu;

import java.lang.reflect.Proxy;

/**
 * @author zhouyu
 * @create 2024-04-18 14:41
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Main {

	private final AService aService;
	private final BService bService;

	@Autowired
	public Main(AService aService, BService bService) {
		this.aService = aService;
		this.bService = bService;
	}

	public static void main(String[] args) {
		// 获取Spring的应用上下文
		ApplicationContext context = new AnnotationConfigApplicationContext("com.zy.zhihu");
		// 获取Main类的实例
		Main main = context.getBean(Main.class);
		// 使用自动注入的AService和BService
		main.aService.a();
		main.bService.b();
	}
}