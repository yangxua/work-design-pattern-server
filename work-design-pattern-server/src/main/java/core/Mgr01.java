package core;

/**
 * @Auther: allanyang
 * @Date: 2019/6/13 20:46
 * @Description:  单例设计模式饿汉式
 */
public class Mgr01 {

    private static final Mgr01 INSTANCE = new Mgr01();

    private Mgr01(){};

    public static Mgr01 getInstance() {
        return INSTANCE;
    }
}