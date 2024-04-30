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

# demo4：stream流去重
    会判断对象中的list，会判断对象中的变量，可放心使用

# demo5：hutool的NumberUtil.div除法
    除数为0会报异常 / by zero

# demo6：“HK0001”.split("KH")
    数组里有几个参数,第一个参数是空，第二个是0001

# demo7：final修饰的第二次赋值会报错吗
    final Integer[] userType = {null};
    userType将不能赋值
    final Integer[] userType = {0,1,2,3};