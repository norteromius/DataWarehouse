package org.brdej.datawarehouse.configuration;

import org.brdej.datawarehouse.data.entities.DatasourceCampain;
import org.brdej.datawarehouse.data.models.DatasourceCampaign;
import org.brdej.datawarehouse.data.readers.CampaignCsvReader;
import org.brdej.datawarehouse.data.repository.CampaignRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.util.List;

@Configuration
class DatabaseLoader {

    private static final Logger log = LoggerFactory.getLogger(DatabaseLoader.class);

    @Bean
    CommandLineRunner initDatabase(CampaignRepository repository){

        List<DatasourceCampaign> parsedData = null;

        try {
            parsedData = CampaignCsvReader.parseFile();
        } catch (IOException e){
            e.printStackTrace();
        }

        try {

            for (DatasourceCampaign campaign : parsedData
            ) {
                repository.save(new DatasourceCampain(campaign.getDatasource(), campaign.getCampaign(), campaign.getDaily(),
                        campaign.getClicks(), campaign.getImpressions()));

            }

        } catch (Throwable e){
            e.printStackTrace();
        }

        return args -> {
            log.info("Preloading " + repository.count());
        };
    }
}
