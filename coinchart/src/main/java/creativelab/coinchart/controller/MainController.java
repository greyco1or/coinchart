package creativelab.coinchart.controller;

import creativelab.coinchart.dto.CryptoPriceList;
import creativelab.coinchart.service.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class MainController {

    private final Service service;

    private final Logger log = LoggerFactory.getLogger(getClass());

    public MainController(Service service) {
        this.service = service;
    }

    @GetMapping("/")
    public String main(Model model){

        service.getPrice();
        Map<String,String> exchangeRate = service.getExchangeRate();
        String usd = exchangeRate.get("usd");
        String jpy = exchangeRate.get("jpy");

        model.addAttribute("usd", usd);
        model.addAttribute("jpy", jpy);
        return  "main";
    }

    //ajax 동기화방식으로 차트 만들기
    @ResponseBody
    @PostMapping("/chart")
    public List<CryptoPriceList> getChart() {

        List<CryptoPriceList> cryptoList = service.getPrice();
        log.info("{}", cryptoList);

        return cryptoList;
    }

}
