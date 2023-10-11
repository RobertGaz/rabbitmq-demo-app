package fanout;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class SubscriberOne {
    private static final Logger LOGGER = LoggerFactory.getLogger(SubscriberOne.class);
    @RabbitListener(queues = "orlanda_queue_1")
    public void receive(String message) {
        LOGGER.info("Received a message: " + message);
    }
}
