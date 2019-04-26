package command;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: allanyang
 * @Date: 2019/4/23 16:48
 * @Description:
 */
public class CommandQueue {

    private List<Command> queue = new ArrayList<>();

    public void addCommand(Command command) {
        queue.add(command);
    }

    public void removeCommand(Command command) {
        queue.remove(command);
    }

    public void execute() {
        queue.forEach(command -> {
            command.execute();
        });
    }
}