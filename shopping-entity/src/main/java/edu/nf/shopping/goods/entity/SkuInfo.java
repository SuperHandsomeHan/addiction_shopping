package edu.nf.shopping.goods.entity;

import edu.nf.shopping.search.entity.GoodsInfo;

import java.math.BigDecimal;

/**
 * @author Achine
 * @date 2020/2/27
 */
public class SkuInfo {
    private Integer skuId;
    private BigDecimal skuPrice;
    private Integer sku_stock;
    private Integer skuSales;
    private GoodsInfo good;

    public Integer getSkuId() {
        return skuId;
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    public BigDecimal getSkuPrice() {
        return skuPrice;
    }

    public void setSkuPrice(BigDecimal skuPrice) {
        this.skuPrice = skuPrice;
    }

    public Integer getSku_stock() {
        return sku_stock;
    }

    public void setSku_stock(Integer sku_stock) {
        this.sku_stock = sku_stock;
    }

    public Integer getSkuSales() {
        return skuSales;
    }

    public void setSkuSales(Integer skuSales) {
        this.skuSales = skuSales;
    }

    public GoodsInfo getGood() {
        return good;
    }

    public void setGood(GoodsInfo good) {
        this.good = good;
    }
}
