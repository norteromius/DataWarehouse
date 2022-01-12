package org.brdej.datawarehouse.data.repository;

import org.brdej.datawarehouse.data.entities.DatasourceCampain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface CampaignRepository extends JpaRepository<DatasourceCampain, Long> {


    @Query("SELECT d FROM DatasourceCampain d WHERE d.datasource = ?1")
    List<DatasourceCampain> findByDatasource(String datasource);

    @Query("SELECT d FROM DatasourceCampain d WHERE d.campaign = ?1")
    List<DatasourceCampain> findByCampaign(String campaign);



}
