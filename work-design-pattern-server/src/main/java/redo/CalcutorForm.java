package redo;

/**
 * @Auther: allanyang
 * @Date: 2019/4/23 17:59
 * @Description:
 */
public class CalcutorForm {

    public Command command;

    public CalcutorForm(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void compute(int val) {
        System.out.println("执行运算，运算结果为：" + command.execute(val));

    }

    public void undo() {
        System.out.println("执行撤销，运算结果为：" + command.undo());
    }
}