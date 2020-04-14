package com.inventory.flipkart.config;

import com.inventory.flipkart.service.InventoryService;
import com.inventory.flipkart.service.InventoryServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InventoryConfig {


    @Bean
    public InventoryService inventoryService() {
        return new InventoryServiceImpl();
    }

}
