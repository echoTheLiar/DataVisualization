# 数据可视化 
## 简介 
使用百度开源的Echarts完成数据可视化需求，由于数据极端情况下，Echarts自适应效果不佳，对接口返回给前端的数据进行组装，实现对Echarts的定制化开发。(注：目前的数据源为自己Mock的随机数据，后续考虑接入有意义的数据源)

## 功能介绍
* 折线图：解决报表表头过多情况下，图例与图表线条重叠显示的问题；
* @Todo 饼状图：解决图例过多时，显示堆叠的问题；

## 技术选型
### 后端
* 采用SpringBoot 开发，提供Restful API；

### 前端
* JQuery
* Bootstrap

## 快速体验
* 运行“com.lyn.code”包下的 Application.java 文件启动服务；
* 自适应折线图访问地址：http://localhost:8080/web/charts/line

## 交流建议
* liu_yuning@foxmail.com
