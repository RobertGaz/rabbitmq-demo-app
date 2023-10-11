package fanout;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class Controller {

    @Autowired
    private Publisher publisher;

    @GetMapping("/publish")
    public String publish() {
        publisher.publish();

        return "OK";
    }

    @Autowired
    private PublisherClassic publisherClassic;

    @GetMapping("/publishClassic")
    public String publisherClassic() {
        publisherClassic.publish();

        return "OK";
    }
}
