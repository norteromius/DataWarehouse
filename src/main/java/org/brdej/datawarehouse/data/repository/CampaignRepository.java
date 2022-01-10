package org.brdej.datawarehouse.data.repository;

import org.brdej.datawarehouse.data.entities.DatasourceCampain;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampaignRepository extends JpaRepository<DatasourceCampain, Long> {
}
