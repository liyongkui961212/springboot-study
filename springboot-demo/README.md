# springboot-demo 第一次运行

1. 首先引入sprintmaven依赖

```
    <parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>2.0.0.RELEASE</version>
		<relativePath />
	</parent>
	<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
		<!-- 测试 -->
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
		<!-- aop -->
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-aop</artifactId>
		</dependency>
	</dependencies>
```
2. 创建application.java文件
```java
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
```
**application.java文件用于运行该springboot服务**

3. 相关注解

    1. @SpringBootApplication<br/>
		Spring Boot提供了@SpringBootApplication注解，该注解可以替代@Configuration,@EnableAutoConfiguration,@ComponentScan三个注解<br/>
    2. @EnableAutoConfiguration<br/>
		Spring Boot会自动根据你jar包的依赖来自动配置项目。<br/>
    3. @RestController<br/>
		这个注解相当于同时添加@Controller和@ResponseBody注解。<br/>
    4. @ComponentScan<br/>
		扫描的路径，或包的路径。<br/>
		
4. application.properties文件配置
    application.properties文件会在项目启动时自动加载进来，很多配置需要在该文件中配置，如端口号，项目名，数据库相关配置等。
---
在编辑器启动项目后可以用浏览器访问 http://localhost:8080/test 可以看到hello word的响应
> **到此简单的Spring Boot 项目可以运行了**
