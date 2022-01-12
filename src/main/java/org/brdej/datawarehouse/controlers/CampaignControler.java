package org.brdej.datawarehouse.controlers;


import org.brdej.datawarehouse.data.entities.DatasourceCampain;
import org.brdej.datawarehouse.data.repository.CampaignRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class CampaignControler {


    private final CampaignRepository repository;

    CampaignControler(CampaignRepository repository){
        this.repository = repository;
    }


    @RequestMapping(method = RequestMethod.GET, value = "/query")
    @ResponseBody
    public String genericQuery(@RequestParam Map<String, String> customQuery){

        List<DatasourceCampain> result = repository.findByDatasource(customQuery.get("datasource"));

        result.retainAll(repository.findByCampaign(customQuery.get("campaign")));

        return result.toString();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/query")
    @ResponseBody
    public String clicsQuery(@RequestParam Map<String, String> customQuery){



        return result.toString();
    }

}
