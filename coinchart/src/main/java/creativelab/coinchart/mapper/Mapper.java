package creativelab.coinchart.mapper;

import creativelab.coinchart.dto.Crypto;

@org.apache.ibatis.annotations.Mapper
public interface Mapper {

    public int saveData(Crypto crypto);
}
