# 抄录自[菜鸟教程](https://www.runoob.com/design-pattern)
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
- #### 优点：
  - 在内存里只有一个实例，减少了内存的开销，尤其是频繁的创建和销毁实例。
  - 避免对资源的多重占用。
- #### 缺点：
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
- #### 优点：
  - 建造者独立，易扩展
  - 便于控制细节风险
- #### 缺点：
  - 需要生成的对象具有复杂的内部结构
  - 需要生成的对象内部属性本身相互依赖
- #### 与工厂模式的区别：建造者模式更加关注与零件装配的顺序

### Prototype Pattern(原型模式)
- #### 意图：用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。
- #### 主要解决：在支行期建立和删除原型。
- #### 何时使用：
  - 当一个系统应该独立于它的产品创建，构成和表示时
  - 当要实例化的类是在运行时刻指定时，例如，通过动态装载
  - 为了避免创建一个与产品类层次平行的工厂类层次时
  - 当一个类的实例只能有几个不同状态组合中的一种时。建立相应数目的原型并克隆它们可能比每次用合适的状态手工实例化该类更方便一些
- #### 如何解决：利用已有的一个原型对象，快速地生成和原型对象一样的实例
- #### 关键代码：
  1. 实现克隆操作，在Java继承Cloneable，重写clone()
  2. 原型模式同样用于隔离类对象的使用者和具体类型（易变类）之间的耦合关系，它同样要求这些"易变类"拥有稳定的接口
- #### 优点：
  - 性能提高
  - 逃避构造函数的约束
- #### 缺点：
  - 配备克隆方法需要对类的功能进行通盘考虑，这对于全新的类不是很难，但对于已有的类不一定很容易，特别当一个类引用不支持串行化的间接对象，或者引用含有循环结构的时候
  - 必须实现Cloneable接口

### Adapter Pattern(适配器模式)
- #### 意图：将一个类的接口转换成客户希望的另外一个接口。适配器模式使得原本不兼容而不能一起工作的那些类可以一起工作。
- #### 主要解决：在软件系统中，常常要将一些“现存的对象”放到新的环境中，而新环境要求的接口是现对象不能满足的。
- #### 何时使用：
  - 系统需要使用现有的类，而此类的接口不符合系统的需要。
  - 想要建立一个可以重复使用的类，用于与一些彼此之间没有太大关联的一些类，包括一些可能在将来引进的类一起工作，这些源类不一定有一致的接口。
  - 通过接口转换，将一个类插入另一个类系中。
- #### 如何解决：继承或依赖（推荐）
- #### 关键代码：适配器继承或依赖已有的对象，实现想要的目标接口。
- #### 优点：
  - 可以让两个没有关联的类一起运行
  - 提高了类的复用
  - 增加了类的透明度
  - 灵活性好
- #### 缺点：
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
- #### 优点：
  - 抽象和实现的分离
  - 优秀的扩展能力
  - 实现细节对客户透明
- #### 缺点：
  - 桥接模式的引入会增加系统的理解与设计难度，由于聚合关联关系建立在抽象层，要求开发者针对抽象进行设计与编程
- #### 使用场景：
  - 如果一个系统需要在构件的抽象化角色和具体化角色之间增加更多的灵活性，避免在两个层次之间建立静态的继承联系，通过桥接模式可以使它们在抽象层建立一个关联关系
  - 对于那些不希望使用继承或因为多层次继承导致系统类的个数急剧增加的系统，桥接模式尤为适用
  - 一个类存在两个独立变化的维度，且这两个维度都需要进行扩展
- #### 注意事项：对于两个独立变化的维度，使用桥接模式再适合不过了

### Filter Pattern(过滤器模式)
- #### 过滤器模式（Filter Pattern）或标准模式（Criteria Pattern）是一种设计模式，这种模式允许开发人员使用不同的标准来过滤一组对象，通过逻辑运算以解耦的方式把它们连接起来。这种类型的设计模式属于结构型模式，它结合多个标准来获得单一标准。

### Composite Pattern(组合模式)
- #### 意图：将对象组合成树形结构以表示“部分-整体”的层次结构。组合模式使得用户对单个对象和组合对象的使用具有一致性。
- #### 主要解决：它在我们树型结构的问题中，模糊了简单元素和复杂元素的概念，客户程序可以像处理简单元素一样来处理复杂元素，从而使得客户程序与复杂元素的内部结构解耦
- #### 何时使用：
  - 您想表示对象的部分-整体层次结构（树形结构）
  - 您希望用户忽略组合对象与单个对象的不同，用户将统一地使用组合结构中的所有对象
- #### 如何解决：树枝和叶子实现统一接口，树枝内部组合该接口。
- #### 关键代码：树枝内部组合该接口，并且含有内部属性 List，里面放 Component。
- #### 优点： 
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
- #### 使用场景：
  - 扩展一个类的功能
  - 动态增加功能，动态撤销
- #### 注意事项：可代替继承