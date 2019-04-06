package factorymethod.concretefactory;

import factorymethod.concreteproduct.DatabaseLogger;
import factorymethod.factory.LoggerFactory;
import factorymethod.product.Logger;

/**
 * @Auther: allanyang
 * @Date: 2019/4/6 13:28
 * @Description:
 */
public class DatabaseLoggerFactory extends LoggerFactory {

    @Override
    public Logger createLogger() {
        return new DatabaseLogger();
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