package factorymethod.concreteproduct;


import factorymethod.product.Logger;

/**
 * @Auther: allanyang
 * @Date: 2019/4/6 13:27
 * @Description:
 */
public class FileLogger implements Logger {

    @Override
    public void writeLog() {
        System.out.println("文件日志记录。");
    }
}