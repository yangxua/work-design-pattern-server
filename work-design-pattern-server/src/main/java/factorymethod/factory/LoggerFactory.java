package factorymethod.factory;

import factorymethod.product.Logger;

/**
 * @Auther: allanyang
 * @Date: 2019/4/6 13:28
 * @Description:
 */
public abstract class LoggerFactory {

    public void writeLog() {
        Logger logger = this.createLogger();
        logger.writeLog();
    }


    public abstract Logger createLogger();
    public abstract Logger createLogger(String args);
    public abstract Logger createLogger(Object obj);
}