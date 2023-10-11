package fanout;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class SubscriberTwo {
    private static final Logger LOGGER = LoggerFactory.getLogger(SubscriberTwo.class);
    @RabbitListener(queues = "orlanda_queue_2")
    public void receive(String message) {
        LOGGER.info("Received a message: " + message);
    }
}
