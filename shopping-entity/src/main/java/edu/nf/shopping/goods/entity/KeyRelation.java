package edu.nf.shopping.goods.entity;

import edu.nf.shopping.search.entity.GoodsInfo;

/**
 * @author Achine
 * @date 2020/2/27
 */
public class KeyRelation {
    private Integer keyId;
    private Integer valueId;
    private GoodsInfo good;

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

    public GoodsInfo getGood() {
        return good;
    }

    public void setGood(GoodsInfo good) {
        this.good = good;
    }
}
