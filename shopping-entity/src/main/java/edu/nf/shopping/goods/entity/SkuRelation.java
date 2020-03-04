package edu.nf.shopping.goods.entity;

/**
 * @author Achine
 * @date 2020/2/27
 */
public class SkuRelation {
    private Integer keyId;
    private Integer valueId;
    private SkuInfo skuInfo;

    public Integer getKeyId() {
        return keyId;
    }

    public void setKeyId(Integer keyId) {
        this.keyId = keyId;
    }

    public Integer getValueId() {
        return valueId;
    }

    public void setValueId(Integer valueId) {
        this.valueId = valueId;
    }

    public SkuInfo getSkuInfo() {
        return skuInfo;
    }

    public void setSkuInfo(SkuInfo skuInfo) {
        this.skuInfo = skuInfo;
    }
}
