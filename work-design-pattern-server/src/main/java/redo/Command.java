package redo;

/**
 * @Auther: allanyang
 * @Date: 2019/4/23 17:49
 * @Description:
 */
public abstract class Command {

    protected abstract int execute(int val);
    protected abstract int undo();
}