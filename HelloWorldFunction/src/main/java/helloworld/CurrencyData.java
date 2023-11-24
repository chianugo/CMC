package helloworld;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CurrencyData {

    @JsonProperty("data")
    private String[] data;

    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("symbol")
    private String symbol;

    @JsonProperty("slug")
    private String slug;

    @JsonProperty("cmc_rank")
    private String cmc_rank;

    @JsonProperty("num_market_pairs")
    private String num_market_pairs;

    @JsonProperty("circulating_supply")
    private String circulating_supply;

    @JsonProperty("total_supply")
    private String total_supply;

    @JsonProperty("max_supply")
    private String max_supply;

    @JsonProperty("infinite_supply")
    private String infinite_supply;

    @JsonProperty("last_updated")
    private String last_updated;

    @JsonProperty("date_added")
    private String date_added;

    @JsonProperty("tags")
    private String[] tags;

    @JsonProperty("platform")
    private String platform;

    @JsonProperty("self_reported_circulating_supply")
    private String self_reported_circulating_supply;

    @JsonProperty("self_reported_market_cap")
    private String self_reported_market_cap;

    public String[] getData() {
        return data;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getCmc_rank() {
        return cmc_rank;
    }

    public void setCmc_rank(String cmc_rank) {
        this.cmc_rank = cmc_rank;
    }

    public String getNum_market_pairs() {
        return num_market_pairs;
    }

    public void setNum_market_pairs(String num_market_pairs) {
        this.num_market_pairs = num_market_pairs;
    }

    public String getCirculating_supply() {
        return circulating_supply;
    }

    public void setCirculating_supply(String circulating_supply) {
        this.circulating_supply = circulating_supply;
    }

    public String getTotal_supply() {
        return total_supply;
    }

    public void setTotal_supply(String total_supply) {
        this.total_supply = total_supply;
    }

    public String getMax_supply() {
        return max_supply;
    }

    public void setMax_supply(String max_supply) {
        this.max_supply = max_supply;
    }

    public String getInfinite_supply() {
        return infinite_supply;
    }

    public void setInfinite_supply(String infinite_supply) {
        this.infinite_supply = infinite_supply;
    }

    public String getLast_updated() {
        return last_updated;
    }

    public void setLast_updated(String last_updated) {
        this.last_updated = last_updated;
    }

    public String getDate_added() {
        return date_added;
    }

    public void setDate_added(String date_added) {
        this.date_added = date_added;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getSelf_reported_circulating_supply() {
        return self_reported_circulating_supply;
    }

    public void setSelf_reported_circulating_supply(String self_reported_circulating_supply) {
        this.self_reported_circulating_supply = self_reported_circulating_supply;
    }

    public String getSelf_reported_market_cap() {
        return self_reported_market_cap;
    }

    public void setSelf_reported_market_cap(String self_reported_market_cap) {
        this.self_reported_market_cap = self_reported_market_cap;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
