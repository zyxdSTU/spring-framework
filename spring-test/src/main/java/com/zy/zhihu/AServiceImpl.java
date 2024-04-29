package com.zy.zhihu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author zhouyu
 * @create 2024-04-18 14:34
 */
@Component
public class AServiceImpl implements  AService{
	@Autowired
	private BService bService;

	@Override
	public void a() {
		bService.b();
		System.out.println("aaaaa");
	}
}
