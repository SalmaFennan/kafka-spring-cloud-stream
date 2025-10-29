package ma.enset.kafkaspringcloudstream.controllers;

import ma.enset.kafkaspringcloudstream.events.PageEvent;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageEventController {
    @GetMapping("/publish")
    public PageEvent publish(String name,) {

    }
}
