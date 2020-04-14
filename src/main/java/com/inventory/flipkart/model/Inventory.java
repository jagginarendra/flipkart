package com.inventory.flipkart.model;

public class Inventory {

    private String skuId;
    private int quantity;
    private int price;
    private int tax;

    private Inventory(InventoryBuilder builder) {
        this.skuId = builder.skuId;
        this.quantity = builder.quantity;
        this.price = builder.price;
        this.tax = builder.tax;
    }

    public String getSkuId() {
        return skuId;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }

    public int getTax() {
        return tax;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "skuId='" + skuId + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", tax=" + tax +
                '}';
    }

    public static class InventoryBuilder {
        private String skuId;
        private int quantity;
        private int price;
        private int tax;

        public InventoryBuilder() {

        }

        public InventoryBuilder setSkuId(String skuId) {
            this.skuId = skuId;
            return this;
        }

        public InventoryBuilder setQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public InventoryBuilder setPrice(int price) {
            this.price = price;
            return this;
        }

        public InventoryBuilder setTax(int tax) {
            this.tax = tax;
            return this;
        }


        public Inventory build() {
            return new Inventory(this);
        }

    }
}
