# DataVisualization
## Introduction
## Fuctionality
## Module
## Technology Choices
### backend
### frontend
## Quick Experience
## Problem may occur
## Communication and Suggestion
***
# 数据可视化 
## 简介 
使用百度开源的Echarts完成数据可视化需求，由于数据极端情况下，Echarts自适应效果不佳，对接口返回给前端的数据进行组装，实现对Echarts的定制化开发。
### @Todo
1. 重新定位该项目；
2. 考虑该项目如何作为一个通用的可视化平台：
（1）数据源：可以来自不同地方？机器学习大量训练数据？其他需求产生的数据？
（2）接口：提供的接口应该是通用的，暴露给外部调用？或者外部调用后返回给外部一个可以显示在前端的数据组装（组装的目的是为了：不会在前端出现适应效果不佳的状况）？
（3）存储：有无必要存储数据？
（4）前端：如何把数据可视化展现在前端？而前端并不需要开发太多？
## 功能介绍
* 折线图：解决报表表头过多情况下，图例与图表线条重叠显示的问题；
* 饼状图：解决图例过多时，显示堆叠的问题；
* 

## 模块介绍
* 定制化Echarts模块：
* 数据Mock模块：构造图表数据，为接口提供数据源；
* 接口模块：1. 统一管理接口返回代码及返回信息；2. 接口加密机制；
* 

## 技术选型
### 后端
* 采用SpringBoot 开发，提供Restful API；

### 前端
* JQuery
* Bootstrap

## 快速体验
## 可能出现的问题
## 交流建议
