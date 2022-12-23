package creativelab.coinchart.dto;

public class Crypto {

    private int order;
    private String time;

    private int priceKrw;

    private int priceUsd;

    private int priceJpy;

    private String cryptoName;

    public String getCryptoName() {
        return cryptoName;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public void setCryptoName(String cryptoName) {
        this.cryptoName = cryptoName;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getPriceKrw() {
        return priceKrw;
    }

    public void setPriceKrw(int priceKrw) {
        this.priceKrw = priceKrw;
    }

    public int getPriceUsd() {
        return priceUsd;
    }

    public void setPriceUsd(int priceUsd) {
        this.priceUsd = priceUsd;
    }

    public int getPriceJpy() {
        return priceJpy;
    }

    public void setPriceJpy(int priceJpy) {
        this.priceJpy = priceJpy;
    }

    @Override
    public String toString() {
        return "Crypto{" +
                "order=" + order +
                ", time='" + time + '\'' +
                ", priceKrw=" + priceKrw +
                ", priceUsd=" + priceUsd +
                ", priceJpy=" + priceJpy +
                ", cryptoName='" + cryptoName + '\'' +
                '}';
    }
}
