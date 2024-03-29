# 抄录自[菜鸟教程](https://www.runoob.com/design-pattern)

## 设计模式原则
- ### 单一职责
  - #### 描述：一个类应该只完成一个，如果有多个需要拆分为多个类
  - #### 作用
    - 降低类的复杂度
    - 提高可讲性、可维护性
    - 降低变更引起的风险
  - #### 缺点
    - 类中关注的逻辑过于复杂
    - 不易修改
  - #### 总结：分解类、分解方法以解决职责单一，单个类只关注单个方法
- ### 接口隔离
  - #### 描述：一个类对另一个接口的依赖应该依赖接口中的所有方法而不是部分方法，如果是部分方法则违反了接口隔离原则
  - #### 作用
    - 避免错误的接口实现调用
  - #### 总结： 将接口中的方法拆分开来
- ### 依赖倒转(倒置)
  - #### 描述：高层模块不要依赖低层模块，依赖接口或抽象类，面试对象编程
  - #### 作用
    - 面向接口或抽象类调用
    - 抽象不依赖细节，细节依赖抽象
    - 不关注细节，只关注规范
    - 使用接口传递，构造方法，setter方法实现依赖传递
    - 每个类尽量都存在一个接口/抽象类
    - 继承是遵循里氏替换原则
  - #### 总结：明确规范，不关注细节，易扩展 
- ### 里氏替换
  - #### 描述：子类中尽量不要重写父类中的方法，这样就可以将父类替换为子类并且对程序没有影响，如果非要替换父类中的方法可以使用抽象更高的父类或者使用组合、依赖、聚合
  - #### 作用
    - 父类定义的方法不允许子类重写
  - #### 总结：所有使用基类对象的地方都可以透明的替换成子类的实现
- ### 开闭原则
  - #### 描述：对扩展开放，对修改关闭，用抽象构建框架，用实现扩展细节，尽量通过新的实体实现新的功能，而不是修改已经有的代码
  - #### 作用
    - 逻辑清晰
    - 扩展时创建新的类就可以实现功能的扩展而不需要修改原有逻辑
- ### 迪米特法则
  - #### 描述：一个对象对其它对象保持最少的了解，最少知道法则，直接朋友，
  - #### 作用
    - 减少对象之间的耦合
    - 对其它对象的使用，尽量放到对象的方法中
- ### 合成利用原则
  - #### 描述：能够使用合成或聚合的就不要使用继承
  - #### 作用
    - 

# java design pattern
1. ### **Creational Patterns(创建型模式)**
   1. #### factory 工厂模式
   2. #### abstract 抽象工厂模式
   3. #### singleton 单例模式
   4. #### builder 建造者模式
   5. #### prototype 原型模式
2. ### **Structural Patterns(结构型模式)**
   1. #### adapter 适配器模式
   2. #### bridge 桥接模式
   3. #### filter/criteria 过滤器模式
   4. #### composite 组合模式
   5. #### decorator 装饰器模式
   6. #### facade 外观模式
   7. #### flyweight 享元模式
   8. #### proxy 代理模式
3. ### **Behavioral Patterns(行为型模式)**
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
4. ### **J2EE设计模式**
   1. #### MVC
   2. #### business 业务代表模式
   3. #### composite entity 组合实体模式
   4. #### data access object 数据访问对象模式
   5. #### front controller 前端控制对象模式
   6. #### intercepting filter 拦截过滤器模式
   7. #### service locator 服务定位器模式
   8. #### transfer object 传输对象模式
# **设计模式六大原则**
   1. ###### open close 开闭原则：对扩展开放，对修改关闭。在程序需要进行拓展的时候，不能去修改原有的代码，实现一个热插拔的效果。简言之，是为了使程序的扩展性好，易于维护和升级。想要达到这样的效果，我们需要使用接口和抽象类，后面的具体设计中我们会提到这点。
   2. ###### liskov substitution 里氏代换原则: 里氏代换原则中说，任何基类可以出现的地方，子类一定可以出现。LSP 是继承复用的基石，只有当派生类可以替换掉基类，且软件单位的功能不受到影响时，基类才能真正被复用，而派生类也能够在基类的基础上增加新的行为。里氏代换原则是对开闭原则的补充。实现开闭原则的关键步骤就是抽象化，而基类与子类的继承关系就是抽象化的具体实现，所以里氏代换原则是对实现抽象化的具体步骤的规范。
   3. ###### dependence inversion 依赖倒转原则：这个原则是开闭原则的基础，具体内容：针对接口编程，依赖于抽象而不依赖于具体。
   4. ###### interface segregation 接口隔离原则：使用多个隔离的接口，比使用单个接口要好。它还有另外一个意思是：降低类之间的耦合度。由此可见，其实设计模式就是从大型软件架构出发、便于升级和维护的软件设计思想，它强调降低依赖，降低耦合。
   5. ###### demeter :迪米特法则：一个实体应当尽量少地与其他实体之间发生相互作用，使得系统功能模块相对独立。
   6. ###### composite reuse 合成利用原则：尽量使用合成/聚合的方式，而不是使用继承。

### Factory Pattern(工厂模式)
- #### 意图：定义一个创建对象的接口，让其子类自己决定实例化哪一个工厂类，工厂模式使其创建过程延迟到子类进行。
- #### 主要解决：主要解决接口选择的问题。
- #### 何时使用：我们明确地计划不同条件下创建不同实例时。 
- #### 如何解决：让其子类实现工厂接口，返回的也是一个抽象的产品。 
- #### 关键代码：创建过程在其子类执行。
- #### 优点
  - 一个调用者想创建一个对象，只要知道其名称就可以了。 
  - 扩展性高，如果想增加一个产品，只要扩展一个工厂类就可以。 
  - 屏蔽产品的具体实现，调用者只关心产品的接口。
- #### 缺点
   - 每次增加一个产品时，都需要增加一个具体类和对象实现工厂，使得系统中类的个数成倍增加，在一定程度上增加了系统的复杂度，同时也增加了系统具体类的依赖。这并不是什么好事。
### Abstract Factory Pattern(抽象工厂模式)
- #### 意图：提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类
- #### 主要解决：主要解决接口选择的问题
- #### 何时使用：系统的产品有多玩一个的产品族，而系统只消费其中某一族的产品
- #### 如何解决：在一个产品族里面，定义多个产品。
- #### 关键代码：在一个工厂里聚合多个同类产品。
- #### 优点：当一个产品族中的多个对象被设计成一起工作时，它能保证客户端始终只使用同一个产品族中的对象。
- #### 缺点：产品族扩展非常困难，要增加一个系列的某个产品，既要在抽象 的Creator里加代码，又要在具体的里面加代码。
### Singleton Pattern(单例模式)
- #### 意图：保证一个类仅有一个实例，并提供一个访问它的全局访问点。
- #### 主要解决：一个全局使用的类频繁地创建与销毁。
- #### 何时使用：当您想控制实例数目，节省系统资源的时候。
- #### 如何解决：判断系统是否已经有这个单例，如果有则返回，如果没有则创建。
- #### 关键代码：构造函数是私有的。
- #### 优点
  - 在内存里只有一个实例，减少了内存的开销，尤其是频繁的创建和销毁实例。
  - 避免对资源的多重占用。
- #### 缺点
  - 没有接口，不能继承，与单一职责原则冲突，一个类应该只关心内部逻辑，而不关心外面怎么样来实例化。
- #### 实现方法：共计6种
  - 饿汉式：类加载时，就会实例化，线程安全，无法实例懒加载
  - 普通懒汉式：静态成员不初始化，获取实例时，判断是否需要实例化，线程不安全
  - 懒汉式加锁：静态成员不初始化，获取实例方法直接加synchronized
  - 双检锁/双重校验锁：volatile配合synchronized
  - 登记式/静态内部类：通过一个内部类实现懒加载，类加载时不会实例化，只有在调用内部类后才会实例化
  - 枚举：

### Builder Pattern(建造者模式)
- #### 意图：将一个复杂的构建与其表示相分离，使得同样的构建过程可以创建不同的表示。
- #### 主要解决：主要解决在软件系统中，有时候面临着"一个复杂对象"的创建工作，其通常由各个部分的子对象用一定的算法构成；由于需求的变化，这个复杂对象的各个部分经常面临着剧烈的变化，但是将它们组合在一起的算法却相对稳定。
- #### 何时使用：一些基本部件不会变，而其组合经常变化的时候。
- #### 如果解决：将变与不变分离开。
- #### 关键代码：建造者：创建和提供实例，导演：管理建造出来的实例的依赖关系。
- #### 优点
  - 建造者独立，易扩展
  - 便于控制细节风险
- #### 缺点
  - 需要生成的对象具有复杂的内部结构
  - 需要生成的对象内部属性本身相互依赖
- #### 与工厂模式的区别：建造者模式更加关注与零件装配的顺序

### Prototype Pattern(原型模式)
- #### 意图：用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。
- #### 主要解决：在支行期建立和删除原型。
- #### 何时使用
  - 当一个系统应该独立于它的产品创建，构成和表示时
  - 当要实例化的类是在运行时刻指定时，例如，通过动态装载
  - 为了避免创建一个与产品类层次平行的工厂类层次时
  - 当一个类的实例只能有几个不同状态组合中的一种时。建立相应数目的原型并克隆它们可能比每次用合适的状态手工实例化该类更方便一些
- #### 如何解决：利用已有的一个原型对象，快速地生成和原型对象一样的实例
- #### 关键代码
  1. 实现克隆操作，在Java继承Cloneable，重写clone()
  2. 原型模式同样用于隔离类对象的使用者和具体类型（易变类）之间的耦合关系，它同样要求这些"易变类"拥有稳定的接口
- #### 优点
  - 性能提高
  - 逃避构造函数的约束
- #### 缺点
  - 配备克隆方法需要对类的功能进行通盘考虑，这对于全新的类不是很难，但对于已有的类不一定很容易，特别当一个类引用不支持串行化的间接对象，或者引用含有循环结构的时候
  - 必须实现Cloneable接口

### Adapter Pattern(适配器模式)
- #### 意图：将一个类的接口转换成客户希望的另外一个接口。适配器模式使得原本不兼容而不能一起工作的那些类可以一起工作。
- #### 主要解决：在软件系统中，常常要将一些“现存的对象”放到新的环境中，而新环境要求的接口是现对象不能满足的。
- #### 何时使用
  - 系统需要使用现有的类，而此类的接口不符合系统的需要。
  - 想要建立一个可以重复使用的类，用于与一些彼此之间没有太大关联的一些类，包括一些可能在将来引进的类一起工作，这些源类不一定有一致的接口。
  - 通过接口转换，将一个类插入另一个类系中。
- #### 如何解决：继承或依赖（推荐）
- #### 关键代码：适配器继承或依赖已有的对象，实现想要的目标接口。
- #### 优点
  - 可以让两个没有关联的类一起运行
  - 提高了类的复用
  - 增加了类的透明度
  - 灵活性好
- #### 缺点
  - 过多使用适配器，会让系统非常零乱，不易整体进行把握
  - 由于JAVA至多继承一个类，所以至多只有适配一个适配者类，而且目标必须是抽象类
- #### 使用场景：有动机地修改一个下沉运行的系统的接口，这时应该考虑使用适配器模式。
- #### 注意事项：适配器不是在详细设计时添加的，而是解决正在服役项目的问题

### Bridge Pattern(桥接模式)
- #### 意图：将抽象部分与实现部分分离，使它们都可以独立的变化
- #### 主要解决：在有多种可能会变化的情况下，用继承会造成类爆炸问题，扩展起来不灵活
- #### 何时使用：实现系统可能有多个角度分类，每一种角度都可能变化
- #### 如何解决：把这种多解译分类分离出来，让它们独立变化，减少它们之间耦合
- #### 关键代码：抽象类依赖实现类
- #### 优点
  - 抽象和实现的分离
  - 优秀的扩展能力
  - 实现细节对客户透明
- #### 缺点
  - 桥接模式的引入会增加系统的理解与设计难度，由于聚合关联关系建立在抽象层，要求开发者针对抽象进行设计与编程
- #### 使用场景
  - 如果一个系统需要在构件的抽象化角色和具体化角色之间增加更多的灵活性，避免在两个层次之间建立静态的继承联系，通过桥接模式可以使它们在抽象层建立一个关联关系
  - 对于那些不希望使用继承或因为多层次继承导致系统类的个数急剧增加的系统，桥接模式尤为适用
  - 一个类存在两个独立变化的维度，且这两个维度都需要进行扩展
- #### 注意事项：对于两个独立变化的维度，使用桥接模式再适合不过了

### Filter Pattern(过滤器模式)
- #### 过滤器模式（Filter Pattern）或标准模式（Criteria Pattern）是一种设计模式，这种模式允许开发人员使用不同的标准来过滤一组对象，通过逻辑运算以解耦的方式把它们连接起来。这种类型的设计模式属于结构型模式，它结合多个标准来获得单一标准。

### Composite Pattern(组合模式)
- #### 意图：将对象组合成树形结构以表示“部分-整体”的层次结构。组合模式使得用户对单个对象和组合对象的使用具有一致性。
- #### 主要解决：它在我们树型结构的问题中，模糊了简单元素和复杂元素的概念，客户程序可以像处理简单元素一样来处理复杂元素，从而使得客户程序与复杂元素的内部结构解耦
- #### 何时使用
  - 您想表示对象的部分-整体层次结构（树形结构）
  - 您希望用户忽略组合对象与单个对象的不同，用户将统一地使用组合结构中的所有对象
- #### 如何解决：树枝和叶子实现统一接口，树枝内部组合该接口。
- #### 关键代码：树枝内部组合该接口，并且含有内部属性 List，里面放 Component
- #### 优点
  - 高层模块调用简单。 
  - 节点自由增加。
- #### 缺点：在使用组合模式时，其叶子和树枝的声明都是实现类，而不是接口，违反了依赖倒置原则。
- #### 使用场景：部分、整体场景，如树形菜单，文件、文件夹的管理。
- #### 注意事项：定义时为具体类。

### Decorator Pattern(装饰器)
- #### 意图：动态地给一个对象添加一些额外的职责。就增加功能来说，装饰器模式相比生成子类更为灵活
- #### 主要解决：一般的，我们为了扩展一个类经常使用继承方式实现，由于继承为类引入静态特征，并且随着扩展功能的增多，子类会很膨胀
- #### 何时使用：在不想增加很多子类的情况下扩展类
- #### 如何解决：将具体功能职责划分，同时继承装饰者模式
- #### 关键代码
  - Component 类充当抽象角色，不应该具体实现
  - 修饰类引用和继承 Component 类，具体扩展类重写父类方法
- #### 优点：装饰类和被装饰类可以独立发展，不会相互耦合，装饰模式是继承的一个替代模式，装饰模式可以动态扩展一个实现类的功能
- #### 缺点：多层装饰比较复杂
- #### 使用场景
  - 扩展一个类的功能
  - 动态增加功能，动态撤销
- #### 注意事项：可代替继承

### 外观模式(Facade Pattern)
- #### 意图：为子系统中的一组接口提供一个一致的界面，外观模式定义了一个高层接口，这个接口使得这一子系统更加容易使用
- #### 主要解决：降低访问复杂系统的内部子系统时的复杂度，简化客户端之间的接口
- #### 何时使用
  - 客户端不需要知道系统内部的复杂联系，整个系统只需提供一个"接待员"即可
  - 定义系统的入口
- #### 如何解决：客户端不与系统耦合，外观类与系统耦合
- #### 关键代码：在客户端和复杂系统之间再加一层，这一层将调用顺序、依赖关系等处理好
- #### 优点
  - 减少系统相互依赖
  - 提高灵活性
  - 提高了安全性
- #### 缺点
  - 不符合开闭原则，如果要改东西很麻烦，继承重写都不合适
- #### 使用场景
  - 为复杂的模块或子系统提供外界访问的模块
  - 子系统相对独立
  - 预防低水平人员带来的风险

### 享元模式(Flyweight Pattern)
- #### 意图：运用共享技术有效地支持大量细粒度的对象
- #### 主要解决：在有大量对象时，有可能会造成内存举出，我们把其中共同的部分抽象出来，如果有相同的业务请示，直接返回在内存中已有的对象，避免重新创建
- #### 何时使用：
  - 系统中有大量对象
  - 这些对象消耗大量内存
  - 这些对象的状态在部分可以外部化
  - 这些对象可以按照内蕴状态分为很多组，当把外蕴对象从对象中剔除出来时，每一组对象都可以用一个对象来代替
  - 系统不依赖于这些对象微分，这些对象是不可分辨的
- #### 如何解决：用唯一标识码判断，如果在内存中有，则返回这个唯一标识码所标识的对象
- #### 关键代码：用 HashMap 存储这些对象
- #### 应用实例
  - JAVA 中的 String，如果有则返回，如果没有则创建一个字符串保存在字符串缓存池里面
  - 数据库的数据池
- #### 优点：大大减少对象的创建，降低系统的内存，使效率提高
- #### 缺点：提高了系统的复杂度，需要分离出外部状态和内部状态，而且外部状态具有固有化的性质，不应该随着内部状态的变化而变化，否则会造成系统的混乱
- #### 使用场景
  - 系统有大量相似对象
  - 需要缓冲池的场景
- #### 注意事项
  - 注意划分外部状态和内部状态，否则可能会引起线程安全问题
  - 这些类必须有一个工厂对象加以控制

### 代理模式(Proxy Pattern) 
- #### 意图：为其他对象提供一种代理以控制对这个对象的访问
- #### 主要解决：在直接访问对象时带来的问题，比如说：要访问的对象在远程机器上。在面向对象系统中，有些对象由于某些原因（比如对象创建开销很大，或者某些操作需要安全控制，或者需要进程外的访问），直接访问会给使用者或者系统结构带来很多麻烦，我们可以在访问些对象时加上一个对此对象的访问层。
- #### 何时使用：想在访问一个类时做一些控制。
- #### 如何解决：增加中间层
- #### 关键代码：实现与被代理类组合
- #### 应用实例
  - Windows 里面的快捷方式
  - 买火车票不一定在火车站买，也可以去代售点
  - 一张支票或银行存单是账户中资金的代理。支票在市场交易中用来代替现金，并提供对签发人账号上资金的控制
  - spring aop
- #### 优点
  - 职责清晰
  - 高扩展性
  - 智能化
- #### 缺点
  - 由于在客户端和真实主题之间增加了代理对象，因此有些类型的代理模式可能会造成请示的处理速度变慢
  - 实现代理模式需要额外的工作，有些代理模式的实现非常复杂
- #### 使用场景
  - 远程代理
  - 虚拟代理
  - Copy-on-Write代理
  - 保护(Protect or Access) 代理
  - Cache代理
  - 防火墙代理
  - 同步化代理
  - 智能引用代理
- #### 注意事项
  - 和适配器模式的区别：适配器模式主要改变所考虑对象的接口，而代理模式不能改变所代理类的接口
  - 和装饰器模式的区别：装饰器模式为了增强功能，而代理模式是为了加以控制

### 责任链模式(Chain of Responsibility Pattern)
- #### 意图：避免请求发送者与接收者耦合在一起，让多个对象都有可能接收请求，将这些对象连接成一条链，并且沿着这条链传递请求，直到有对象处理它为止
- #### 主要解决：职责链上的处理者负责处理请求，客户只需要将请求发送到职责链上即可，无须关心请求的处理细节和请求的传递，所以职责链将请求的发送者和请求的处理者解耦了
- #### 何时使用：在处理消息的时候以过滤很多道
- #### 如果解决：拦截的类都实现统一接口
- #### 关键代码：Handler里聚合它自己，在HandlerRequest里判断是否合适，如果没达到条件则向下传递，向谁传递之前set进去
- #### 应用实例
  - 红楼梦中的“击鼓传花” 
  - JS中的事件冒泡 
  - JAVA WEB 中Apache Tomcat 对Encoding的处理，Struts2 的拦截器， jsp servlet的Filter
- #### 优点
  - 降低耦合度
  - 简化了对象
  - 增强给对象指派职责的灵活性
  - 通过改变链内的成员或者调动它们的次序，允许动态地新增或者删除责任
  - 增加新请求处理类很方便
- #### 缺点
  - 不能保证请求一定被接收
  - 系统性能受到一定影响，而且在进行代码调试时不太方便，可能会造成循环调用
  - 可能不容易观察运行时的特征，有碍于除错
- 使用场景
  - 有多个对象可以处理同一个请求，具体哪个对象处理该请求由运行时刻自动确定
  - 在不明确指定接收者的情况下，向多个对象中的一个提交一个请求
  - 可动态指定一组对象处理请求

### 命令模式(Command Pattern)
- #### 意图：将一个请求封装成一个对象，从而使您可以用不同的请求对客户进行参数化
- #### 主要解决：在软件系统中，行为请求者与行为实现者通常是一种紧耦合的关系，但某些场合，比如需要对行为进行记录、撤销或重做、事务等处理时，这种无法抵御变化的紧耦合的设计就不太合适
- #### 何时使用：在某些场合，比如要对行为进行“记录、撤销/重做、事务”等处理，这种无法抵御变化的紧耦合是不合适的。在这种情况下，如何将“行为请求者”与“行为实现者”解耦？将一组行为抽象为对象，可以实现二者之间的松耦合
- #### 如何解决：通过调用者调用接受者执行命令，顺序：调用者->命令->接受者
- #### 关键代码：定义三个角色：1. received真正的命令执行对象 2. command 3. invoker使用命令对象的入口
- #### 应用实例：struts1中的action核心控制器ActionServlet只有一个，相当于Invoker，而模型层的类会随着不同的应用有不同的模型类，相当于具体的Command
- #### 优点 
  - 降低系统耦合度
  - 新的命令可以很容易添加到系统中去
- #### 缺点
  - 使用命令模式可以会导致某些系统有过多的具体命令类
- #### 使用场景：认为是命令的地方都可以使用命令模式，比如：
  - GUI中每一个按钮都是一条命令 
  - 模拟CMD

### 解释器模式(Interpreter Pattern)
- #### 意图：给定一个语言，定义它的方法表示，并定义一个解释器，这个解释器使用该标识来解释语言中的句子。
- #### 主要解决：对于一些固定方法构建一个解释句子的解释器
- #### 何时使用：如果一种特定类型的问题发生的频率足够高，那么可能就值得将该问题的各个实例表述为一个简单语言中的句子。这样就可以构建一个解释器，该解释器通过解释这些句子来解决该问题
- #### 如何解决：构建语法树，定义终结符与非终结符
- #### 关键代码：构造环境类，包含解释器之外的一些做事情信息，一般是HashMap
- #### 应用实例：编译器、运算表达式计算
- #### 优点
  - 可扩展性好，灵活
  - 增加了新的解释表达的方式
  - 易于实现简单文法
- #### 缺点
  - 可复用场景比较少
  - 对于复杂的文法比较难维护
  - 解释器模式会引起类膨胀
  - 解释器模式采用递归调用文法
- #### 使用场景
  - 可以将一个需要解释执行的语言中的铺子表示为一个抽象语法树
  - 一些重复出现的问题可以用一种简单的语言来进行表达
  - 一个简单语法需要解释的场景

### 迭代器模式(Iterator Pattern)
- #### 意图：提供一种方法顺序访问一个聚合对象中各个元素，而又无须暴露该对象的内部表示
- #### 主要解决：不同的方式来遍历整个整合对象
- #### 何时使用：遍历一个聚合对象
- #### 如何解决：把在元素之间游走的责任交给迭代器，而不是聚合对象
- #### 关键代码：定义接口：hasNext, next
- #### 应用实例：JAVA中的iterator
- #### 优点
  - 它支持以不同的方式遍历一个聚合对象
  - 迭代器简化了聚合类
  - 在同一个聚合上可以有多个遍历
  - 在迭代器模式中，增加新的聚合类和迭代器都很方便，无须修改原有代码
- #### 缺点
  - 由于迭代器模式将存储数据和遍历数据的职责分离，增加新的聚合类需要对应增加新的迭代器类，类的个数成对增加，这在一定程序上增加了系统的复杂性
- #### 使用场景
  - 访问一个聚合对象的内容而无须暴露它的内部表示
  - 需要为聚合对象提供多种遍历方式
  - 为遍历不同的聚合结构提供一个统一个的接口

### 中介者模式(Mediator Pattern)
- #### 意图：用一个中介对象来封装一系列的对象交互，中介者使各对象不需要显式地相互引用，从而使用其耦合松散，而且可以独立地改变它们之间的交互
- #### 主要解决：对象与对象之间存在大量的关联关系，这样势必会导致系统的结构变得很复杂，同时若一个对象发生改变，我们也需要跟踪与之相关联的对象，同时做出相应的处理
- #### 如何使用：多个类相互耦合，形成了网状结构
- #### 如何解决：将上述网状结构分离为星型结构
- #### 关键代码：对象Colleague之间的通信封装到一个类中单独处理
- #### 应用实例
  - 中国加入WTO之前是各个国家相互贸易，结构复杂，现存是各个国家通过WTO来互相贸易
  - 机场调试系统
  - MVC框架，其中C(控制器)就是M(模型)和V(视图)的中介者
- #### 优点
  - 降低了类的复杂度，将一对多转化成了一对一
  - 各个类之间的解耦
  - 符合迪米特原则
- #### 缺点
  - 中介者会庞大，变得复杂难以维护
- #### 使用场景：
  - 系统中对象之间存在比较复杂的引用关系，导致它们之间的依赖关系结构混乱而且难以复用该对象
  - 想通过一个中间类来封装多个类中的行为，而又不想生成太多的子类

### 备忘录模式(Memento Pattern)
- #### 意图：在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态
- #### 主要解决：所谓备忘录模式就是在不破坏封装的前提下，捕获内部状态，并在该对象之外保存这个状态，这样可以在以后将对象恢复到原先保存的状态
- #### 何时使用：很多时候我们问题需要记录一个对象的内部状态，这样做的目的就是为了允许用户取消不确定霸者错误的操作，能够恢复到他原先的状态，使得他有“后悔药”可吃
- #### 如何解决：通过一个备忘录类专门存储对象状态
- #### 关键代码：客户不与备忘录耦合，与备忘录管理类耦合
- #### 应用实例：
  - 后悔药
  - 打游戏时的存档
  - windows里的ctrl + z
  - ie中的后退
  - 数据库的事务管理
- #### 优点
  - 给用户提供了一种可以恢复状态的机制，可以使用户能够比较方便地回到某个历史的状态
  - 实现了信息的封装，使用用户不需要关心状态的保存细节
- #### 缺点
  - 消耗资源
- #### 使用场景
  - 需要保存恢复数据的相关状态场景
  - 提供一个可回滚的操作

### 观察者模式(Observer Pattern)
- #### 意图：定义对象间的一种一对多的依赖关系当一个对象 的状态发生改变时，所有依赖于它的对象都得到通知并被自动更新
- #### 何时使用：一个对象(目标对象)的状态发生改变，所有依赖对象(观察者对象)都将得到通知，进行广播通知
- #### 如何解决：使用面向对象技术，可以将这种倒带关系弱化
- #### 关键代码：在抽象类里有一个ArrayList存放观察者对象们
- #### 应用实例
  - 拍卖的时候，拍卖师观察最高标价，然后通知给其他竞价者竞价
- #### 优点
  - 观察者和被观察者是抽象耦合的
  - 建立一套触发机制
- #### 缺点
  - 如果一个被观察者对象有很多的直接和间接的观察者的话，将所有的观察者都通知到会花费很多时间
  - 如果在观察者和观察目标之间有循环依赖的话，观察目标会触发它们之间进行循环调用，可能收不到系统崩溃
  - 观察者模式没有相应的机制让观察者知道所观察的目标对象是怎么发生变化而仅仅只是知道观察目标发生了变化

### 状态模式(State Pattern)
- #### 意图：允许对象在内部状态发生改变时改变它的行为，对象看起来好像修改了它的类
- #### 主要解决：对象的行为依赖于它的状态(属性)，并且可以根据它的状态改变而改变它的相关行为
- #### 何时使用：将各种具体的状态有关的条件语句
- #### 如何解决：将各种具体的状态类抽象出来
- #### 关键代码：通常命令模式的接口中只有一个方法。而状态模式的接口中有一个或者多个方法。而且，状态模式的实现类的方法，一般返回值，或者是改变实例变量的值。也就是说，状态模式一般和对象的状态有关。实现类的方法有不同的功能，覆盖接口的方法。状态李薇薇命令模式一样，也可以用于消除if...else等条件选择语句。
- #### 应用实例
  - 打篮球的时候运动员可以有下沉状态、不正常状态和超常状态
- #### 优点
  - 封装了转换规则
  - 枚举可能状态，在枚举状态之前需要确定状态种类
  - 将所有与某个状态有关的行为放到一个类中，并且可以方便地增加新状态，只需要改变对象状态即可改变对象的行为
  - 允许状态转换逻辑与状态对象合成一体，而不是某一个巨大的条件语句块
  - 可以让多个环境对象共享一个状态对象，从而减少系统中对象的个数
- #### 缺点
  - 状态模式的使用必然会增加系统类和对象的个数
  - 状态模式的结构与实现都较为复杂，如果使用不当将导致程序结构和代码的混乱
  - 状态模式对“开闭原则”的支持并不太好，对于可以切换状态的状态模式，增加新的状态类需要修改那些负责状态转换的源代码，否则无法切换到新增状态，而且修改某个状态类的行为也需修改对象类的源代码
- #### 使用场景
  - 行为随状态改变而改变的场景
  - 条件分支语句的代替者

### 空对象模式
- #### 意图：允许对空的对象进行一些操作
- #### 主要解决：当对象为Null时提供一些方法
- #### 何时使用：当对象为Null时，并且需要提供一些方法
- #### 如何解决：将对象与空对象分成两个类创建实现同一父类
- #### 关键代码：父类抽象属性与方法，分两个子类实现，一个子类为空实现
- #### 优点
  - 当对象中的属性为空时，依旧可以执行一些方法
- #### 缺点
  - 需要有多余的类、与抽象类

### 策略模式(Strategy Pattern)
- #### 意图：定义一系列算法，把它们一个个封闭起来，并且使它们可想互替换
- #### 主要解决：在有多种算法相似的情况下，使用if...else所带来的复杂和难改维护
- #### 何时使用：一个系统有许多许多类，而区分它们的只是他们直接的行为
- #### 如何解决：将这些算法封闭成一个一个的类，任意的替换
- #### 关键代码：实现同一个接口
- #### 应用实例
  - 诸葛亮的锦囊妙计，每个锦囊就是一个策略
  - 放行的出游方式，选择骑自行车、坐汽车，第一种旅行方式都是一个策略
  - Java AWT中的LayoutManager
- #### 优点
  - 算法可以自由切换
  - 避免使用多重条件判断
  - 扩展性良好
- #### 缺点
  - 策略会增多
  - 所有策略类都需要对外暴露
- #### 使用场景
  - 如果在一个系统里面有许多类，它们之间的区别仅在于它们的行为，那么使用策略模式可以动态地让一个对象在许多行为中选择一种行为
  - 一个系统需要动态地在几种算法中选择一种
  - 如果一个对象有很多的行为，如果不同恰当的模式，这些行为就只好使用多重的条件选择语句来实现
- #### 注意事项：如果一个系统的策略多于四个，就需要考虑使用混合模式，解决策略类膨胀的问题

### 模板模式(Template Pattern)
- #### 意图：定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤
- #### 主要解决：一些方法通用，却在每一个子类都重写了这一方法
- #### 何时使用：有一些通用的方法
- #### 如何解决：将这睦通用算法抽象出来
- #### 关键代码：在抽象类实现，其他步骤在子类实现
- #### 应用实现
  - 在造房子的时候，地基、走线、水管都一样，只有在建筑的后期才有加壁橱加栅栏等差异
  - spring中对Hibernate的支持，将一些已经定义好的方法封装起来，比如开启事务、获取session、关闭session等，程序员不重复写那些已经规范好的代码，直接丢一个实体就可以保存
- #### 优点
  - 封装不变部分，扩展可变部分
  - 提取公共代码，便于维护
  - 行为由父类控制，子类实现
- #### 缺点：每一个不同的实现都需要一个子类来实现，导致类的个数增加，使得系统更加庞大
- #### 使用场景：
  - 有多个子类共有的方法，且逻辑相同
  - 重要的、复杂的方法，可以考虑作为模板方法
- #### 注意事项：为防止恶意操作，一般模板方法都加上final关键词

### 访问者模式(Visitor Pattern)
- #### 意图：主要将数据结构与数据操作分离
- #### 主要解决：稳定的数据结构和易变的操作耦合问题
- #### 何时使用：需要对一个对象结构中的对象进行很多不同的并且不相关的操作，而需要避免让这些操作"污染"这些对象的类，使用访问者模式将这些封装到类中
- #### 如何解决：在被访问的类里面加一个对外提供接待访问者的接口
- #### 关键代码：在数据基础类里面有一个方法接受访问者，将自身引用传入访问者
- #### 应用实例：
- #### 优点
  - 符合单一职责原则
  - 优秀的扩展性
  - 灵活性
- #### 缺点
  - 具体元素对访问者公布细节，违反了迪米特原则
  - 具体元素变更比较困难
  - 违反了倒带倒置原则，依赖了具体类，没有依赖抽象
- #### 使用场景：减少对对象结构的改变
- #### 注意事项：访问者可以对功能进行统一，可以做报表，UI，拦截器与过滤器