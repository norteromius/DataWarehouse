package org.brdej.datawarehouse.data.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Objects;

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

    public DatasourceCampain(){

    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DatasourceCampain that = (DatasourceCampain) o;
        return clicks == that.clicks &&
                impressions == that.impressions &&
                id.equals(that.id) &&
                datasource.equals(that.datasource) &&
                campaign.equals(that.campaign) &&
                daily.equals(that.daily);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, datasource, campaign, daily, clicks, impressions);
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("datasource=").append(this.datasource).append(",campaign=").append(this.campaign)
                .append(",daily=").append(this.daily.toString()).append(",clicks=").append(this.clicks)
                .append(",impessions=").append(this.impressions);

        return stringBuilder.toString();
    }
}
