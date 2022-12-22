package creativelab.coinchart.controller;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import creativelab.coinchart.dto.Crypto;
import creativelab.coinchart.service.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    private final Service service;
    private final Gson gson;

    private final Logger log = LoggerFactory.getLogger(getClass());

    public MainController(Service service, Gson gson) {
        this.service = service;
        this.gson = gson;
    }

    @GetMapping("/")
    public String main(Model model) {

        ResponseEntity<Object> apiResult = service.getPrice();

        JsonArray crypto = gson.toJsonTree(apiResult.getBody()).getAsJsonArray();
        System.out.println("crypto ->>" +crypto);
        System.out.println("1->>" + apiResult.getBody());
        System.out.println("2->>" + gson.toJsonTree(apiResult.getBody()));

        List<Crypto> cryptoList = new ArrayList<Crypto>();
        for (JsonElement jsonElement : crypto) {
            String time = jsonElement.getAsJsonObject().get("trade_time_kst").getAsString();
            int Krw = jsonElement.getAsJsonObject().get("trade_price").getAsInt();
            Crypto coin = new Crypto();
            coin.setTime(time);
            coin.setPriceKrw(Krw);


            model.addAttribute("cryptoList", cryptoList);

            return "main";
        }

        return "main";
    }
}
