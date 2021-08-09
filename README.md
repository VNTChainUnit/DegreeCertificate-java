# DegreeCertificate-java

项目为[DegreeCertificate2.0](https://github.com/VNTChainUnit/DegreeCertificate2.0)的Java端。详细请看项目[主页](https://github.com/VNTChainUnit/DegreeCertificate2.0)

## 项目简介

基于区块链的学位核验管理平台，Java端。

采用SpringBoot+Dubbo+Zookeeper的Java端，多个模块共同完成包括证书查询系统、证书核验系统、对外API系统、授权系统等多个业务。

重构于1.0，使用Java作为主要技术栈，采用微服务体系。

> 目前属于开发阶段，请见谅。

## 运行条件

- Java 1.8+
- [DegreeCertificate-Node](https://github.com/VNTChainUnit/DegreeCertificate-node)
- Zookeeper

## 技术架构

基于Dubbo+SpringBoot+Zookeeper搭建微服务，证书模块需要对接Node微服务。

