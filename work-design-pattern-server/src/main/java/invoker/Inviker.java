package invoker;

import command.CommandQueue;

/**
 * @Auther: allanyang
 * @Date: 2019/4/23 17:18
 * @Description:
 */
public class Inviker {

    private CommandQueue queue;

    public void setQueue(CommandQueue queue) {
        this.queue = queue;
    }

    public Inviker(CommandQueue queue) {
        this.queue = queue;
    }

    public void call() {
        queue.execute();
    }
}