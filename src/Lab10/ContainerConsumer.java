package Lab10;

import java.util.Queue;

public class ContainerConsumer {
    public static void ConsumeQueue(Queue<Command> com) {
        var iterator = com.iterator();
        while (iterator.hasNext()) {
            var temp = iterator.next();
            temp.operation();
        }
    }

}
