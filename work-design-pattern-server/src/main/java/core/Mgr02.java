package core;

/**
 * @Auther: allanyang
 * @Date: 2019/6/13 20:54
 * @Description:
 */
public class Mgr02 {

    private static volatile Mgr02 INSTANCE;

    private Mgr02(){}

    public static Mgr02 getInstance() {
        if (null == INSTANCE) {
            synchronized (Mgr02.class) {
                if (null == INSTANCE) {
                    INSTANCE = new Mgr02();
                }
            }
        }

        return INSTANCE;
    }
}