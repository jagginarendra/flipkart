package com.inventory.flipkart.controller;

import com.inventory.flipkart.model.Inventory;

public interface Controller {

    Inventory getInventoryBySkuId(String skuId);

}
