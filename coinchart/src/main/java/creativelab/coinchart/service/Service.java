package creativelab.coinchart.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.*;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@org.springframework.stereotype.Service
public class Service {

    private final Logger log = LoggerFactory.getLogger(getClass());

    public ResponseEntity<Object> getChart() {

        ResponseEntity<Object> result = new ResponseEntity<>(null, null, 200);
        log.info("{}", result);

        try{
            RestTemplate restTemplate = new RestTemplate();

            System.out.println(restTemplate + "  <-- restTemplate");

            HttpHeaders header = new HttpHeaders();
            System.out.println(header + "  <-- header");

            HttpEntity<?> entity = new HttpEntity<>(header);
            System.out.println(entity + "  <-- entity");

            UriComponents uri = UriComponentsBuilder.fromHttpUrl("https://api.upbit.com/v1/ticker?markets=KRW-BTC").build();
            System.out.println(uri + "  <-- uri");

            result = restTemplate.exchange(uri.toString(), HttpMethod.GET, entity, Object.class);
            System.out.println(result);
        } catch (HttpClientErrorException | HttpServerErrorException e) {
            log.info(e.toString());
            return result;
        }
        return result;
    }
}
