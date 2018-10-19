package com.springboot.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopTest {
	@Pointcut("execution(public * com.springboot.controller.*.*(..))")
	public void dopointcut() {
	}
	
	@Around("dopointcut()")
	public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
		long start = System.currentTimeMillis();
		Object result = pjp.proceed();
		long end = System.currentTimeMillis();
		System.out.println("方法执行时间："+(end-start)+"ms");
		return result;
	}
	/*@Before("dopointcut()")
	public void before(JoinPoint joinPoint) {
		System.out.println("切入点之前。。");
	}
	
	@After("dopointcut()")
	public void after(JoinPoint joinPoint) {
		System.out.println("切入之后点。。");
	}
	
	@AfterReturning(returning = "ret", pointcut="dopointcut()")
	public void getResult(Object ret) {
	   System.out.println("获取到结果之后处理结果："+ret);
	}*/
}
