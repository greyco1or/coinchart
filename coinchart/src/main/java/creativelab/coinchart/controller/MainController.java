package creativelab.coinchart.controller;

import creativelab.coinchart.dto.CryptoPriceList;
import creativelab.coinchart.service.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MainController {

    private final Service service;

    private final Logger log = LoggerFactory.getLogger(getClass());

    public MainController(Service service) {
        this.service = service;
    }

    @GetMapping("/")
    public String main(Model model){



        return  "main";
    }

    @ResponseBody
    @PostMapping("/chart")
    public List<CryptoPriceList> getChart() {

        List<CryptoPriceList> cryptoList = cryptoList = service.getPrice();
        log.info("{}", cryptoList);

        return cryptoList;
    }

}
