# mylistener
监听器相关

JavaWeb中的监听器
l  事件源：三大域！
Ø  ServletContext
¨      生命周期监听：ServletContextListener，它有两个方法，一个在出生时调用，一个在死亡时调用；
                                     void contextInitialized(ServletContextEvent sce)：创建Servletcontext时
                                     void contextDestroyed(ServletContextEvent sce)：销毁Servletcontext时
¨      属性监听：ServletContextAttributeListener，它有三个方法，一个在添加属性时调用，一个在替换属性时调用，最后一个是在移除属性时调用。
                                    void attributeAdded(ServletContextAttributeEvent event)：添加属性时；
                                    void attributeReplaced(ServletContextAttributeEvent event)：替换属性时；
                                    void attributeRemoved(ServletContextAttributeEvent event)：移除属性时；
Ø  HttpSession
¨      生命周期监听：HttpSessionListener，它有两个方法，一个在出生时调用，一个在死亡时调用；
                                  voidsessionCreated(HttpSessionEvent se)：创建session时
                                   void sessionDestroyed(HttpSessionEvent se)：销毁session时
¨      属性监听：HttpSessioniAttributeListener，它有三个方法，一个在添加属性时调用，一个在替换属性时调用，最后一个是在移除属性时调用。
                                  void attributeAdded(HttpSessionBindingEvent event)：添加属性时；
                                  void attributeReplaced(HttpSessionBindingEvent event)：替换属性时
                                  void attributeRemoved(HttpSessionBindingEvent event)：移除属性时
Ø  ServletRequest
¨      生命周期监听：ServletRequestListener，它有两个方法，一个在出生时调用，一个在死亡时调用；
                                voidrequestInitialized(ServletRequestEvent sre)：创建request时
                                 void requestDestroyed(ServletRequestEvent sre)：销毁request时
¨      属性监听：ServletRequestAttributeListener，它有三个方法，一个在添加属性时调用，一个在替换属性时调用，最后一个是在移除属性时调用。
                               voidattributeAdded(ServletRequestAttributeEvent srae)：添加属性时
                                void attributeReplaced(ServletRequestAttributeEvent srae)：替换属性时
                                void attributeRemoved(ServletRequestAttributeEvent srae)：移除属性时 
                                javaWeb中完成编写监听器：
Ø  写一个监听器类：要求必须去实现某个监听器接口；
Ø  注册，是在web.xml中配置来完成注册！
