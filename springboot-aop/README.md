# SpingBoot AOP的实现
1. 添加maven依赖
```       
	   <dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-aop</artifactId>
		</dependency>
```
2. 创建AOP类
```
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
```
---
## 测试步骤
1. 将项目导入编辑器,
2. 运行Application.java,
3. 清空编辑器console,
4. 打开浏览器输入http://localhost:8080/test
## 结果
可以看到浏览器输出：	hello word
编辑器console输出：	方法执行时间：3ms