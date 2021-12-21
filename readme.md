# java design pattern

1. ### **Creational Patterns(创建型模式)**
   1. #### factory 工厂模式
   2. #### abstract 抽象工厂模式
   3. #### singleton 单例模式
   4. #### builder 建造者模式
   5. #### prototype 原型模式
2. **Structural Patterns(结构型模式)**
   1. #### adapter 适配器模式
   2. #### bridge 桥接模式
   3. #### filter/criteria 过滤器模式
   4. #### composite 组合模式
   5. #### decorator 装饰器模式
   6. #### facade 外观模式
   7. #### flyweight 享元模式
   8. #### proxy 代理模式
3. **Behavioral Patterns(行为型模式)**
   1. #### chain of responsibility 责任链模式
   2. #### command 命令模式
   3. #### interpreter 解释器模式
   4. #### iterator 迭代器模式
   5. #### mediator 中介者模式
   6. #### memento 备忘录模式
   7. #### observer 观察者模式
   8. #### state 状态模式
   9. #### null object 空对象模式
   10. #### strategy 策略模式
   11. ####  template 模板模式
   12. ####  visitor 访问者模式
4. **J2EE设计模式**
   1. #### MVC
   2. #### business 业务代表模式
   3. #### composite entity 组合实体模式
   4. #### data access object 数据访问对象模式
   5. #### front controller 前端控制对象模式
   6. #### intercepting filter 拦截过滤器模式
   7. #### service locator 服务定位器模式
   8. #### transfer object 传输对象模式
5. **设计模式六大原则**
   1. open close 开闭原则：对扩展开放，对修改关闭。在程序需要进行拓展的时候，不能去修改原有的代码，实现一个热插拔的效果。简言之，是为了使程序的扩展性好，易于维护和升级。想要达到这样的效果，我们需要使用接口和抽象类，后面的具体设计中我们会提到这点。
   2. liskov substitution 里氏代换原则: 里氏代换原则中说，任何基类可以出现的地方，子类一定可以出现。LSP 是继承复用的基石，只有当派生类可以替换掉基类，且软件单位的功能不受到影响时，基类才能真正被复用，而派生类也能够在基类的基础上增加新的行为。里氏代换原则是对开闭原则的补充。实现开闭原则的关键步骤就是抽象化，而基类与子类的继承关系就是抽象化的具体实现，所以里氏代换原则是对实现抽象化的具体步骤的规范。
   3. dependence inversion 依赖倒转原则：这个原则是开闭原则的基础，具体内容：针对接口编程，依赖于抽象而不依赖于具体。
   4. interface segregation 接口隔离原则：使用多个隔离的接口，比使用单个接口要好。它还有另外一个意思是：降低类之间的耦合度。由此可见，其实设计模式就是从大型软件架构出发、便于升级和维护的软件设计思想，它强调降低依赖，降低耦合。
   5. demeter :迪米特法则：一个实体应当尽量少地与其他实体之间发生相互作用，使得系统功能模块相对独立。
   6. composite reuse 合成利用原则：尽量使用合成/聚合的方式，而不是使用继承。