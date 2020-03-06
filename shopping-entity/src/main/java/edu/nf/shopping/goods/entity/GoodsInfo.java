package edu.nf.shopping.goods.entity;

import java.util.Date;

/**
 * @author Achine
 * @date 2020/2/26
 */
public class GoodsInfo {
    private String goodsId;
    private String goodsName;
    private Date shelfTime;
    private Byte isShelf;
    private SpuInfo spuInfo;
    private GoodsType goodsType;

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Date getShelfTime() {
        return shelfTime;
    }

    public void setShelfTime(Date shelfTime) {
        this.shelfTime = shelfTime;
    }

    public Byte getIsShelf() {
        return isShelf;
    }

    public void setIsShelf(Byte isShelf) {
        this.isShelf = isShelf;
    }

    public SpuInfo getSpuInfo() {
        return spuInfo;
    }

    public void setSpuInfo(SpuInfo spuInfo) {
        this.spuInfo = spuInfo;
    }

    public GoodsType getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(GoodsType goodsType) {
        this.goodsType = goodsType;
    }
}
