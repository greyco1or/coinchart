package creativelab.coinchart.dto;

public class Crypto {

    private String time;

    private int priceKrw;

    private int priceUsd;

    private int priceJpy;

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
                "time='" + time + '\'' +
                ", priceKrw=" + priceKrw +
                ", priceUsd=" + priceUsd +
                ", priceJpy=" + priceJpy +
                '}';
    }
}
