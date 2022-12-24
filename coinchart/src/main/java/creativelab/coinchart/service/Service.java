package creativelab.coinchart.service;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import creativelab.coinchart.dto.Crypto;
import creativelab.coinchart.dto.CryptoPriceList;
import creativelab.coinchart.mapper.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.*;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {

    private final Logger log = LoggerFactory.getLogger(getClass());
    private final Mapper mapper;
    private final Gson gson;

    public Service(Mapper mapper, Gson gson) {
        this.gson = gson;
        this.mapper = mapper;
    }

    //크립토 가격 가져오기
    public List<CryptoPriceList> getPrice(){
        List<CryptoPriceList> cryptoList = mapper.getPrice();
        log.info("{}", cryptoList);
        return cryptoList;
    }

    //30분마다 데이터 저장하기
    @Scheduled(cron = "0 0/30 * * * *")
    public void autoData(){
        log.info("스케줄러 실행");
        setData(getData());
    }

    //api 데이터 처리해서 DB에 담기
    public void setData(ResponseEntity<Object> apiResult){
        JsonArray cryptoList = gson.toJsonTree(apiResult.getBody()).getAsJsonArray();
        //System.out.println("1->>" + apiResult.getBody());
        //System.out.println("2->>" + gson.toJsonTree(apiResult.getBody()));

        //List<Crypto> cryptoList = new ArrayList<Crypto>();
        for (JsonElement jsonElement : cryptoList) {
            String ticker = jsonElement.getAsJsonObject().get("market").getAsString();
            log.info("{}", "Ticker: " + ticker);

            if(ticker.equals("KRW-BTC")) {
                Crypto bitcoin = new Crypto();
                //String dateKst = jsonElement.getAsJsonObject().get("trade_date_kst").getAsString();
                //String timeKst = jsonElement.getAsJsonObject().get("trade_time_kst").getAsString();
                int Krw = jsonElement.getAsJsonObject().get("trade_price").getAsInt();
                //bitcoin.setTime(dateKst + timeKst);
                bitcoin.setPriceKrw(Krw);
                log.info("{}", bitcoin);
                mapper.btcInfoSave(bitcoin);
            } else if(ticker.equals("KRW-ETH")){
                Crypto ethereum = new Crypto();
                //String dateKst = jsonElement.getAsJsonObject().get("trade_date_kst").getAsString();
                //String timeKst = jsonElement.getAsJsonObject().get("trade_time_kst").getAsString();
                int Krw = jsonElement.getAsJsonObject().get("trade_price").getAsInt();
                //ethereum.setTime(dateKst + timeKst);
                ethereum.setPriceKrw(Krw);
                log.info("{}", ethereum);
                mapper.ethInfoSave(ethereum);
            } else if(ticker.equals("KRW-BCH")){
                Crypto bitcoinCash = new Crypto();
                //String dateKst = jsonElement.getAsJsonObject().get("trade_date_kst").getAsString();
                //String timeKst = jsonElement.getAsJsonObject().get("trade_time_kst").getAsString();
                int Krw = jsonElement.getAsJsonObject().get("trade_price").getAsInt();
                //bitcoinCash.setTime(dateKst + timeKst);
                bitcoinCash.setPriceKrw(Krw);
                log.info("{}", bitcoinCash);
                mapper.bchInfoSave(bitcoinCash);
            } else if(ticker.equals("KRW-SOL")){
                Crypto solana = new Crypto();
                //String dateKst = jsonElement.getAsJsonObject().get("trade_date_kst").getAsString();
                //String timeKst = jsonElement.getAsJsonObject().get("trade_time_kst").getAsString();
                int Krw = jsonElement.getAsJsonObject().get("trade_price").getAsInt();
                //solana.setTime(dateKst + timeKst);
                solana.setPriceKrw(Krw);
                log.info("{}", solana);
                mapper.solInfoSave(solana);
            }

        }

    }

    //두나무 api로 크립토 정보 가져오는 메소드
    public ResponseEntity<Object> getData() {

        ResponseEntity<Object> result = new ResponseEntity<>(null, null, 200);
        log.info("{}", result);

        try{
            RestTemplate restTemplate = new RestTemplate();

            //System.out.println(restTemplate + "  <-- restTemplate");

            //HttpHeaders header = new HttpHeaders();
            //System.out.println(header + "  <-- header");

            HttpEntity<?> entity = new HttpEntity<>(null);
            //System.out.println(entity + "  <-- entity");

            //UriComponents uri = UriComponentsBuilder.fromHttpUrl("https://api.upbit.com/v1/ticker?markets=KRW-BTC%2CKRW-ETH").build();
            String uri = "https://api.upbit.com/v1/ticker?markets=KRW-BTC,KRW-ETH,KRW-BCH,KRW-SOL";
            result = restTemplate.exchange(uri, HttpMethod.GET, entity, Object.class);
            log.info("{}", result);
        } catch (HttpClientErrorException | HttpServerErrorException e) {
            log.info(e.toString());
            return result;
        }
        return result;
    }

}
