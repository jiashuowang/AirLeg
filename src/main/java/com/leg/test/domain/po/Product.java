package com.leg.test.domain.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name ="product_recommendation")
public class Product implements Serializable {
    @Id
    @Column(name = "ITEM_ID")
    private Integer itemId;
    @Column(name = "ITEM_NAME")
    private String itemName;
    @Column(name = "ITEM_PRICE")
    private Double itemPrice;
    @Column(name = "CLUSTER")
    private String cluster;
    @Column(name = "PIC_URL")
    private String picURL;

    public Product() {
    }

    public Product(Integer itemId, String itemName, Double itemPrice, String cluster, String picURL) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.cluster = cluster;
        this.picURL = picURL;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getCluster() {
        return cluster;
    }

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    public String getPicURL() {
        return picURL;
    }

    public void setPicURL(String picURL) {
        this.picURL = picURL;
    }

    @Override
    public String toString() {
        return "Product{" +
                "itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                ", cluster='" + cluster + '\'' +
                ", picURL='" + picURL + '\'' +
                '}';
    }
}
