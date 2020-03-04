package edu.nf.shopping.search.entity;

/**
 * @author Achine
 * @date 2020/3/4
 */
public class GoodsRelation {
    private Integer rid;
    private SpuInfo spuInfo;
    private GoodsType goodsType;

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
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
