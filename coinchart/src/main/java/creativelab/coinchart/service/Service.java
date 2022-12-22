package creativelab.coinchart.service;

import creativelab.coinchart.dto.Crypto;
import creativelab.coinchart.mapper.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.*;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

@org.springframework.stereotype.Service
public class Service {

    private final Logger log = LoggerFactory.getLogger(getClass());
    private final Mapper mapper;

    public Service(Mapper mapper) {
        this.mapper = mapper;
    }

    public ResponseEntity<Object> getPrice() {

        ResponseEntity<Object> result = new ResponseEntity<>(null, null, 200);
        log.info("{}", result);

        try{
            RestTemplate restTemplate = new RestTemplate();

            System.out.println(restTemplate + "  <-- restTemplate");

            //HttpHeaders header = new HttpHeaders();
            //System.out.println(header + "  <-- header");

            HttpEntity<?> entity = new HttpEntity<>(null);
            System.out.println(entity + "  <-- entity");

            //UriComponents uri = UriComponentsBuilder.fromHttpUrl("https://api.upbit.com/v1/ticker?markets=KRW-BTC%2CKRW-ETH").build();
            String uri = "https://api.upbit.com/v1/ticker?markets=KRW-BTC,KRW-ETH,KRW-BCH,KRW-SOL";
            result = restTemplate.exchange(uri, HttpMethod.GET, entity, Object.class);
            System.out.println(result);
        } catch (HttpClientErrorException | HttpServerErrorException e) {
            log.info(e.toString());
            return result;
        }
        return result;
    }

    public void saveData(Crypto crypto){
        mapper.saveData(crypto);
    }
}
