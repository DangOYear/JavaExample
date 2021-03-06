### 享元模式


+ 主要解决
在有大量对象时，有可能会造成内存溢出，我们把其中共同的部分抽象出来，如果有相同的业务请求，直接返回在内存中已有的对象，避免重新创建。
运用共享技术有效地支持大量细粒度的对象。

+ 应用
1. JAVA 中的 String，如果有则返回，如果没有则创建一个字符串保存在字符串缓存池里面
2. 数据库的数据池

+ 优点
大大减少对象的创建，降低系统的内存，使效率提高。
  
+ 缺点
提高了系统的复杂度，需要分离出外部状态和内部状态，而且外部状态具有固有化的性质，不应该随着内部状态的变化而变化，否则会造成系统的混乱。