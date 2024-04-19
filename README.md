Demo 类是测试类

# demo1：Set集合中，如果添加同一类型的对象，属性不同，是否会失败
    添加的类相同，类的属性变量，相同，会添加失败
    添加的类不同，类的属性变量，相同，会添加成功

# demo2：接口有多个实现类，注入接口会调用哪个实现
    注入的时候变量名要写实现类的名字，就会按照名字注入，这时候如果自定义变量名将会出错
        private final Panent childA;  注入ChildA实现类
        private final Panent childB;  注入ChildB实现类

# demo3：测试事务直接里面，this调用会不会导致事务失效
    this.sava()    wareInDetailService.save()
    不会失效
    在事务方法内，添加并且还能返回添加的新数据
    查询结果封装在实体类中的集合中
    .lambdaQuery()链式多条件查询