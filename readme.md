#### 概述：spring boot 分页插件实现：
##### 测试方法
   - 运行person.sql
   - 启动项目
   - 访问路径：http://127.0.0.1/queryPerson?pageNum=3&pageSize=2
---
##### 实现步骤
- 添加依赖
```
    <dependency>
        <groupId>com.github.pagehelper</groupId>
        <artifactId>pagehelper-spring-boot-starter</artifactId>
        <version>1.2.5</version>
    </dependency>
```        
- 配置文件
- 编程
---
##### 问题
配置文件不配置也可以实现
