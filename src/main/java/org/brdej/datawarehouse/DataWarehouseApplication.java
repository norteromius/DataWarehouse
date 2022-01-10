package org.brdej.datawarehouse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication()
public class DataWarehouseApplication {

    public static void main(String[] args) {

        try {
            SpringApplication.run(DataWarehouseApplication.class, args);

        } catch (Throwable e) {
            e.printStackTrace();
        }



        
    }

}
