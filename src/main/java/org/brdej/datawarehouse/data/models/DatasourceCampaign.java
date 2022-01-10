package org.brdej.datawarehouse.data.models;

import com.opencsv.bean.CsvBindByPosition;
import com.opencsv.bean.CsvDate;

import java.time.LocalDate;

public class DatasourceCampaign {

    @CsvBindByPosition(position = 0)
    private String datasource;

    @CsvBindByPosition(position = 1)
    private String campaign;

    @CsvDate(value = "MM/dd/yy")
    @CsvBindByPosition(position = 2)
    private LocalDate daily;

    @CsvBindByPosition(position = 3)
    private int clicks;

    @CsvBindByPosition(position = 4)
    private int impressions;

    public String getDatasource() {
        return datasource;
    }

    public void setDatasource(String datasource) {
        this.datasource = datasource;
    }

    public String getCampaign() {
        return campaign;
    }

    public void setCampaign(String campaign) {
        this.campaign = campaign;
    }

    public LocalDate getDaily() {
        return daily;
    }

    public void setDaily(LocalDate daily) {
        this.daily = daily;
    }

    public int getClicks() {
        return clicks;
    }

    public void setClicks(int clicks) {
        this.clicks = clicks;
    }

    public int getImpressions() {
        return impressions;
    }

    public void setImpressions(int impressions) {
        this.impressions = impressions;
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("datasource=").append(this.datasource).append(",campaign=").append(this.campaign)
                .append(",daily=").append(this.daily.toString()).append(",clicks=").append(this.clicks)
                .append(",impessions=").append(this.impressions);

        return stringBuilder.toString();
    }
}
