package com.zy;

import org.aopalliance.aop.Advice;
import org.springframework.aop.Advisor;
import org.springframework.aop.MethodBeforeAdvice;

/**
 * @author zhouyu
 * @create 2023-11-23 9:57
 */
public class TestAdvisor implements Advisor {

	@Override
	public Advice getAdvice() {
		//方法执行前打印ok
		return (MethodBeforeAdvice) (method, args, target) -> {
			System.out.println("ok");
		};
	}

	@Override
	public boolean isPerInstance() {
		return true;
	}
}
