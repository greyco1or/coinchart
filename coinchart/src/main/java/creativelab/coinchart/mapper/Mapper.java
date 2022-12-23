package creativelab.coinchart.mapper;

import creativelab.coinchart.dto.Crypto;

@org.apache.ibatis.annotations.Mapper
public interface Mapper {

    public void btcInfoSave(Crypto crypto);
    public void ethInfoSave(Crypto crypto);
    public void bchInfoSave(Crypto crypto);
    public void solInfoSave(Crypto crypto);

}
