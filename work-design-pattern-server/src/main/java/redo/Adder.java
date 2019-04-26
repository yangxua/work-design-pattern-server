package redo;

/**
 * @Auther: allanyang
 * @Date: 2019/4/23 17:48
 * @Description:
 */
public class Adder {

    private int num = 0;

    public int add(int value) {
        num += value;
        return num;
    }
}