### 简单工厂中，构建对象需要修改工厂类，不符合开闭原则，怎么避免？
> 工厂方法模式将构建对象封装在一个**抽象**方法中，通过子类继承实现新课程增加。

> **依赖倒置原则** *上层组件不能依赖下层组件，并且它们都不能依赖具体，而应该依赖抽象。*
> VideoFactory是上层，JAVAVideo是下层。抽象出来Video，VideoFactory依赖Video这个抽象，JAVAVideo也依赖。
>
# 抽象工厂
## 如果需要构建一组对象怎么办？
> 将构建一组对象的细节封装在一个接口中

**抽象工厂模式 和 工厂方法模式 的区别在于：**

- 前者适用于构建多个对象，并且使用组合。c
- 后者适用于构建单个对象，并且使用继承。
