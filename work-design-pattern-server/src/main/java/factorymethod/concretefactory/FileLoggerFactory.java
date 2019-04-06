package factorymethod.concretefactory;

import factorymethod.concreteproduct.FileLogger;
import factorymethod.factory.LoggerFactory;
import factorymethod.product.Logger;

/**
 * @Auther: allanyang
 * @Date: 2019/4/6 13:29
 * @Description:
 */
public class FileLoggerFactory extends LoggerFactory {


    @Override
    public Logger createLogger() {
        return new FileLogger();
    }

    @Override
    public Logger createLogger(String args) {
        return null;
    }

    @Override
    public Logger createLogger(Object obj) {
        return null;
    }
}