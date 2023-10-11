package fanout;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PublisherClassic {
    @Qualifier("rabbitTemplate")
    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void publish() {
        rabbitTemplate.convertAndSend("my-fanout-exchange", null, "Privetik");
    }
}
