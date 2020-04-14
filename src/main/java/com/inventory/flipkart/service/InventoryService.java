package com.inventory.flipkart.service;

import com.inventory.flipkart.model.Inventory;

public interface InventoryService {

    Inventory getInventoryBySkuId(String skuId);

}
