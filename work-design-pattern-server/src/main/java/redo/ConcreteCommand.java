package redo;

/**
 * @Auther: allanyang
 * @Date: 2019/4/23 17:51
 * @Description:
 */
public class ConcreteCommand extends Command{

    private Adder adder = new Adder();
    private int val;


    @Override
    protected int execute(int val) {
        this.val = val;
        return adder.add(val);
    }

    @Override
    protected int undo() {
        return adder.add(-val);
    }
}