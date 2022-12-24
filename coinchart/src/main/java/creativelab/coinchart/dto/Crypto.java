package creativelab.coinchart.dto;

public class Crypto {

    private int order;
    private String time;

    private int priceKrw;

    private double priceUsd;

    private double priceJpy;

    private String cryptoName;

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
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

    public double getPriceUsd() {
        return priceUsd;
    }

    public void setPriceUsd(double priceUsd) {
        this.priceUsd = priceUsd;
    }

    public double getPriceJpy() {
        return priceJpy;
    }

    public void setPriceJpy(double priceJpy) {
        this.priceJpy = priceJpy;
    }

    public String getCryptoName() {
        return cryptoName;
    }

    public void setCryptoName(String cryptoName) {
        this.cryptoName = cryptoName;
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
