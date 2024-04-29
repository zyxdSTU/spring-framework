package com.zy;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * @author zhouyu
 * @create 2023-11-30 14:44
 */
@Aspect
@Component
@EnableAspectJAutoProxy
public class TestAspect {

	@Pointcut("execution(* com.zy.*.*(..))")
	private void pointCutMethod() {
	}

	/**
	 * 前置通知.
	 */
	@Before("pointCutMethod()")
	public void doBefore() {
		System.out.println("前置通知");
	}
}
