# Springboot 打包成war放在tomcat下运行
_war包也可以通过java -jar 命令执行_
1. 需要添加maven依赖
``` 
     	<dependency>  
	        <groupId>org.springframework.boot</groupId>  
	        <artifactId>spring-boot-starter-tomcat</artifactId>  
	        <scope>provided</scope>  
	    </dependency>  
	  
	    <dependency>  
	        <groupId>org.apache.tomcat.embed</groupId>  
	        <artifactId>tomcat-embed-jasper</artifactId>  
	        <scope>provided</scope>  
	    </dependency> 
```

2. 构造类似web.xml的启动类
```
   	 public class SpringBootStartApplication extends SpringBootServletInitializer {
	 
     		@Override
    		protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
      		  // 注意这里要指向原先用main方法执行的Application启动类
        	return builder.sources(Application.class);
    		}
  }
```
