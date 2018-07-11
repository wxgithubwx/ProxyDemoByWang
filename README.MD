###1. 想要做到的功能
    拦截某个类的指定方法（目标方法）
    class Book{
        private String name;
        public void setName(String name){
            this.name = name;
            System.out.println("书籍的名称是：" + name);
        }
    }
    想要拦截setName方法的调用
    Book book = new Book();
    book.setName();//拦截此方法的调用
    
    ///////////最终输出的结果////////////////////////
    调用方法开始了......
    书籍的名称是：Java讲义               setName()
    调用方法结束了......
    ///////////////////////////////////
    
    在目标方法执行前，搞事情（调用某个类MyAdvice的某个方法 before() ）
    在目标方法执行后，搞事情（调用某个类MyAdvice的某个方法 after() ）
    class MyAdvice{
        public void before(){
            System.out.println("调用方法开始了......");
        }
        public void after(){
            System.out.println("调用方法结束了......");
        }
    }
    概念：
        目标对象：book
        连接点：被拦截的方法（setName）
        切入点：我要拦截setName方法，或者拦截getName
        通知：MyAdvice类的before、after方法
        切面：MyAdvice类
###代理
    静态代理:  代码冗余    
    动态代理： 优点：Java 动态代理可以避免静态代理带来的代码冗余的问题。 
              缺点：Java 动态代理只能针对接口创建代理，不能针对类创建代理