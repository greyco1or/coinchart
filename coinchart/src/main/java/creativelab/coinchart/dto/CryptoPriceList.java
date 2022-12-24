package creativelab.coinchart.dto;

public class CryptoPriceList {

    private int order;
    private String time;

    private int btcKrw;
    private double btcJpy;
    private double btcUsd;

    private int bchKrw;
    private double bchJpy;
    private double bchUsd;

    private int ethKrw;
    private double ethJpy;
    private double ethUsd;

    private int solKrw;
    private double solJpy;
    private double solUsd;

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

    public double getBtcJpy() {
        return btcJpy;
    }

    public void setBtcJpy(double btcJpy) {
        this.btcJpy = btcJpy;
    }

    public double getBtcUsd() {
        return btcUsd;
    }

    public void setBtcUsd(double btcUsd) {
        this.btcUsd = btcUsd;
    }

    public int getBchKrw() {
        return bchKrw;
    }

    public void setBchKrw(int bchKrw) {
        this.bchKrw = bchKrw;
    }

    public double getBchJpy() {
        return bchJpy;
    }

    public void setBchJpy(double bchJpy) {
        this.bchJpy = bchJpy;
    }

    public double getBchUsd() {
        return bchUsd;
    }

    public void setBchUsd(double bchUsd) {
        this.bchUsd = bchUsd;
    }

    public int getEthKrw() {
        return ethKrw;
    }

    public void setEthKrw(int ethKrw) {
        this.ethKrw = ethKrw;
    }

    public double getEthJpy() {
        return ethJpy;
    }

    public void setEthJpy(double ethJpy) {
        this.ethJpy = ethJpy;
    }

    public double getEthUsd() {
        return ethUsd;
    }

    public void setEthUsd(double ethUsd) {
        this.ethUsd = ethUsd;
    }

    public int getSolKrw() {
        return solKrw;
    }

    public void setSolKrw(int solKrw) {
        this.solKrw = solKrw;
    }

    public double getSolJpy() {
        return solJpy;
    }

    public void setSolJpy(double solJpy) {
        this.solJpy = solJpy;
    }

    public double getSolUsd() {
        return solUsd;
    }

    public void setSolUsd(double solUsd) {
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
