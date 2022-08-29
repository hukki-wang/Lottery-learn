# 抽奖系统


## 环境配置
- 技术栈:jdk1.8 Maven3.6.3 Mysql5.7 Springboot2.6 dubbo注册中心随POM版本 redis nacos配置中心 kafak消息队列 xxljob分布式任务调度 自研路由分库分表组件
- 初始打包:你需要在 Lottery 工程的 Maven 根上，点击 Install 这样才能完整打包，否则 Lottery-Test 等，不能正常引入 Jar 包
- 建表sql:doc/asserts/sql - 建议随非分支内sql版本走，因为需求不断迭代升级优化，直接使用最新的会遇到在各个分支下的代码运行问题
- 服务部署:阿里云docker部署