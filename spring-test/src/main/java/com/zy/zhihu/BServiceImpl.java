package com.zy.zhihu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author zhouyu
 * @create 2024-04-18 14:35
 */
@Component
public class BServiceImpl implements BService{
	@Autowired
	private AService aService;

	@Override
	public void b() {
		System.out.println("bbbbb");
	}

	@Override
	public void bb() {
		aService.a();
	}
}
