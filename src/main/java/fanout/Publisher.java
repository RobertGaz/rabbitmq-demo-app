package fanout;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Publisher {
    @Autowired
    @Qualifier("fanoutExchangeTemplate")
    private RabbitTemplate rabbitTemplate;

    public void publish() {
        rabbitTemplate.convertAndSend("routing key", "Hello from Publisher! " +
                "This message was sent to fanout exchange");
    }
}
