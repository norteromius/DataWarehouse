package org.brdej.datawarehouse.data.readers;

import com.opencsv.bean.CsvToBeanBuilder;
import org.brdej.datawarehouse.data.models.DatasourceCampaign;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

public class CampaignCsvReader {


    public static List<DatasourceCampaign> parseFile() throws IOException {

        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream is = classloader.getResourceAsStream("PIxSyyrIKFORrCXfMYqZBI.csv");

        List<DatasourceCampaign> beans = new CsvToBeanBuilder(new InputStreamReader(is))
                .withType(DatasourceCampaign.class)
                .withSkipLines(1)
                .build()
                .parse();

        return beans;
    }

}
