package creativelab.coinchart.controller;

import creativelab.coinchart.service.Service;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    private final Service service;

    public MainController(Service service) {
        this.service = service;
    }

    @GetMapping("/")
    public String main() {

        ResponseEntity<Object> btcinfo = service.getChart();

        return "main";
    }
}
