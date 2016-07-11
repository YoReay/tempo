# 设计模式

> OO基础

* 抽象
* 封装
* 多态
* 继承

> OO原则

* 封装变化
* 多用组合，少用继承
* 针对接口编程，不针对实现编程
* 为交互对象之间的松耦合设计而努力

> OO模式

## 策略模式
> 定义算法族，分别封装起来，让它们之间可以互相替换，此模式让算法的变化独立于使用算法的客户。


## 观察者模式
> 定义了对象之间的一对多依赖，这样一来，当一个对象改变状态时，它的所有依赖者都会收到通知并自动更新。

![观察者模式](https://yoreay.github.io/tempo/img/observer.png)

> java内置的观察者模式

java.util.Observable:主题，可观察者，一个类。

java.util.Observer:观察者，接口。

Observable黑暗面：

1. Observable是一个类，java不支持多继承，所以Observable限制了类的复用性。
2. Observable将关键方法保护起来，setChanged()方法的访问权限是protected。