package concretecommand;

import command.Command;
import receiver.HelpHandler;

/**
 * @Auther: allanyang
 * @Date: 2019/4/23 16:13
 * @Description:
 */
public class HelpCommand extends Command {

    private HelpHandler hhObj; //维持对请求接收者的引用

    @Override
    public void execute() {
        hhObj.display();
    }
}