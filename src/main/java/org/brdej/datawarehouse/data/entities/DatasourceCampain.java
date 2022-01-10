package org.brdej.datawarehouse.data.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class DatasourceCampain {

    @Id
    @GeneratedValue
    private Long id;

    private String datasource;

    private String campaign;

    private LocalDate daily;

    private int clicks;

    private int impressions;

    public DatasourceCampain(String datasource, String campaign, LocalDate daily, int clicks, int impressions) {
        this.datasource = datasource;
        this.campaign = campaign;
        this.daily = daily;
        this.clicks = clicks;
        this.impressions = impressions;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
}
