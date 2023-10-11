package my;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

public class MyMessageListener implements MessageListener {
    private static final Logger LOGGER = LoggerFactory.getLogger(MyMessageListener.class);

    @Override
    public void onMessage(Message message) {
        LOGGER.info("Received message: " + new String(message.getBody()));
    }
}
