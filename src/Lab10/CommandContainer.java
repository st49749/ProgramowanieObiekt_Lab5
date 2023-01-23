package Lab10;

import java.util.LinkedList;
import java.util.Queue;

public class CommandContainer {
    public CommandContainer() {

    }

    public Queue<Command> GetQueue(Queue<Command> queue) {
        queue.add(new Command("Komenda 1"));
        queue.add(new Command("Komenda 2"));
        queue.add(new Command("Komenda 3"));
        queue.add(new Command("Komenda 4"));
        queue.add(new Command("Komenda 5"));

        return queue;
    }
}
