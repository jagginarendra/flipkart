package com.inventory.flipkart.service;

import com.inventory.flipkart.model.Inventory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

public class InventoryServiceImpl implements InventoryService {

    private static final Logger logger = LoggerFactory.getLogger(InventoryServiceImpl.class);

    @Override
    public Inventory getInventoryBySkuId(String skuId) {

        Random random = new Random();
        Inventory inventory = new Inventory.InventoryBuilder().setSkuId(skuId).setPrice(random.nextInt(15000)).setQuantity(random.nextInt(50))
                .setTax(50).build();

        return inventory;
    }
}
