package my;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Получатель {
    private static final Logger ЛОГГЕР = LoggerFactory.getLogger(Получатель.class);

    @RabbitListener(queues = "my_queue_2")
    public void получить(String сообщение) {
        ЛОГГЕР.info("Я получил сообщение!: " + сообщение);
    }
}
