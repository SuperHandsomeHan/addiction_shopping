package edu.nf.shopping.goods.entity;

import edu.nf.shopping.search.entity.GoodsInfo;

/**
 * @author Achine
 * @date 2020/2/27
 */
public class IntroduceInfo {
    private Integer introduceId;
    private String iRemark;
    private ImgsInfo img;
    private Integer introduceIndex;
    private IntroduceType introduceType;
    private GoodsInfo good;

    public Integer getIntroduceId() {
        return introduceId;
    }

    public void setIntroduceId(Integer introduceId) {
        this.introduceId = introduceId;
    }

    public String getiRemark() {
        return iRemark;
    }

    public void setiRemark(String iRemark) {
        this.iRemark = iRemark;
    }

    public ImgsInfo getImg() {
        return img;
    }

    public void setImg(ImgsInfo img) {
        this.img = img;
    }

    public Integer getIntroduceIndex() {
        return introduceIndex;
    }

    public void setIntroduceIndex(Integer introduceIndex) {
        this.introduceIndex = introduceIndex;
    }

    public IntroduceType getIntroduceType() {
        return introduceType;
    }

    public void setIntroduceType(IntroduceType introduceType) {
        this.introduceType = introduceType;
    }

    public GoodsInfo getGood() {
        return good;
    }

    public void setGood(GoodsInfo good) {
        this.good = good;
    }
}
