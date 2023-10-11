package my;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private Sender sender;

    @GetMapping("/send")
    public String send() {
        sender.send();
        return "OK";
    }

    @GetMapping("/send2")
    public String send2() {
        sender.send2();
        return "OK";
    }
}
