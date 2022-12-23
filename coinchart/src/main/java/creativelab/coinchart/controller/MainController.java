package creativelab.coinchart.controller;

import creativelab.coinchart.service.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class MainController {

    private final Service service;

    private final Logger log = LoggerFactory.getLogger(getClass());

    public MainController(Service service) {
        this.service = service;
    }

    @GetMapping("/")
    public String main(){

        log.info("{}", service.getPrice());


        return  "main";
    }

    @GetMapping("/chart")
    public String chart(Model model) {

        ResponseEntity<Object> apiResult = service.getData();
        //service.setData(apiResult);

        return "main";
    }
}
