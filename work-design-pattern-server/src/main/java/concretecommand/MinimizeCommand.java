package concretecommand;

import command.Command;
import receiver.WindowHanlder;

/**
 * @Auther: allanyang
 * @Date: 2019/4/23 16:15
 * @Description:
 */
public class MinimizeCommand extends Command {

    private WindowHanlder whObj;

    @Override
    public void execute() {
        whObj.minimize();
    }
}