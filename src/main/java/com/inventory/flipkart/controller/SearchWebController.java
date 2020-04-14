package com.inventory.flipkart.controller;

import com.inventory.flipkart.model.Inventory;
import com.inventory.flipkart.service.InventoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchWebController implements Controller {


    @Autowired
    InventoryService inventoryService;

    private static final Logger logger = LoggerFactory.getLogger(SearchWebController.class);

    @Override
    @GetMapping("/inventory")
    public Inventory getInventoryBySkuId(@RequestParam("skuId") String skuId) {

        logger.error("###############Requrest Recived");

        if (skuId == null || skuId.trim().length() == 0) {
            throw new RuntimeException("Invalid sku " + skuId);
        }

        return inventoryService.getInventoryBySkuId(skuId);
    }
}
