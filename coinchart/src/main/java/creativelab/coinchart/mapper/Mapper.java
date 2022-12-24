package creativelab.coinchart.mapper;

import creativelab.coinchart.dto.Crypto;
import creativelab.coinchart.dto.CryptoPriceList;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface Mapper {

    public List<CryptoPriceList> getPrice();
    public void btcInfoSave(Crypto crypto);
    public void ethInfoSave(Crypto crypto);
    public void bchInfoSave(Crypto crypto);
    public void solInfoSave(Crypto crypto);

}
