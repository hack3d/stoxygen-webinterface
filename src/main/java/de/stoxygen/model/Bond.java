package de.stoxygen.model;

public class Bond {

    private Integer bonds_id;
    private String name;
    private String isin;
    private Integer state;
    private String cryptoPair;
    private String cryptoBase;
    private String cryptoQuote;

    public Bond() {}

    public void setBonds_id(Integer bonds_id) {
        this.bonds_id = bonds_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIsin(String isin) {
        this.isin = isin;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public void setCryptoPair(String cryptoPair) {
        this.cryptoPair = cryptoPair;
    }

    public void setCryptoBase(String cryptoBase) {
        this.cryptoBase = cryptoBase;
    }

    public void setCryptoQuote(String cryptoQuote) {
        this.cryptoQuote = cryptoQuote;
    }

    public Integer getBonds_id() {
        return bonds_id;
    }

    public String getName() {
        return name;
    }

    public String getIsin() {
        return isin;
    }

    public Integer getState() {
        return state;
    }

    public String getCryptoPair() {
        return cryptoPair;
    }

    public String getCryptoBase() {
        return cryptoBase;
    }

    public String getCryptoQuote() {
        return cryptoQuote;
    }
}
