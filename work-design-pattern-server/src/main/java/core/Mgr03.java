package core;

/**
 * @Auther: allanyang
 * @Date: 2019/6/13 20:58
 * @Description:
 */
public class Mgr03 {

    private Mgr03(){}

    private static class Mgr03Holder {
        private  final static Mgr03 INSTANCE = new Mgr03();
    }

    public static Mgr03 getInstance() {
        return Mgr03Holder.INSTANCE;
    }

}