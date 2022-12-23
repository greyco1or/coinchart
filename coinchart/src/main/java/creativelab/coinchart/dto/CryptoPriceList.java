package creativelab.coinchart.dto;

public class CryptoPriceList {

    private int order;
    private String time;

    private int btcKrw;
    private int btcJpy;
    private int btcUsd;

    private int bchKrw;
    private int bchJpy;
    private int bchUsd;

    private int ethKrw;
    private int ethJpy;
    private int ethUsd;

    private int solKrw;
    private int solJpy;
    private int solUsd;

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

    public int getBtcKrw() {
        return btcKrw;
    }

    public void setBtcKrw(int btcKrw) {
        this.btcKrw = btcKrw;
    }

    public int getBtcJpy() {
        return btcJpy;
    }

    public void setBtcJpy(int btcJpy) {
        this.btcJpy = btcJpy;
    }

    public int getBtcUsd() {
        return btcUsd;
    }

    public void setBtcUsd(int btcUsd) {
        this.btcUsd = btcUsd;
    }

    public int getBchKrw() {
        return bchKrw;
    }

    public void setBchKrw(int bchKrw) {
        this.bchKrw = bchKrw;
    }

    public int getBchJpy() {
        return bchJpy;
    }

    public void setBchJpy(int bchJpy) {
        this.bchJpy = bchJpy;
    }

    public int getBchUsd() {
        return bchUsd;
    }

    public void setBchUsd(int bchUsd) {
        this.bchUsd = bchUsd;
    }

    public int getEthKrw() {
        return ethKrw;
    }

    public void setEthKrw(int ethKrw) {
        this.ethKrw = ethKrw;
    }

    public int getEthJpy() {
        return ethJpy;
    }

    public void setEthJpy(int ethJpy) {
        this.ethJpy = ethJpy;
    }

    public int getEthUsd() {
        return ethUsd;
    }

    public void setEthUsd(int ethUsd) {
        this.ethUsd = ethUsd;
    }

    public int getSolKrw() {
        return solKrw;
    }

    public void setSolKrw(int solKrw) {
        this.solKrw = solKrw;
    }

    public int getSolJpy() {
        return solJpy;
    }

    public void setSolJpy(int solJpy) {
        this.solJpy = solJpy;
    }

    public int getSolUsd() {
        return solUsd;
    }

    public void setSolUsd(int solUsd) {
        this.solUsd = solUsd;
    }

    @Override
    public String toString() {
        return "CryptoPriceList{" +
                "order=" + order +
                ", time='" + time + '\'' +
                ", btcKrw=" + btcKrw +
                ", btcJpy=" + btcJpy +
                ", btcUsd=" + btcUsd +
                ", bchKrw=" + bchKrw +
                ", bchJpy=" + bchJpy +
                ", bchUsd=" + bchUsd +
                ", ethKrw=" + ethKrw +
                ", ethJpy=" + ethJpy +
                ", ethUsd=" + ethUsd +
                ", solKrw=" + solKrw +
                ", solJpy=" + solJpy +
                ", solUsd=" + solUsd +
                '}';
    }
}
