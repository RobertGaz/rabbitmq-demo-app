package my;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Sender {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void send() {
        rabbitTemplate.convertAndSend("my_queue", "kek");
    }

    public void send2() {
        rabbitTemplate.convertAndSend("my_queue_2", "kek");
    }
}
