package edu.nf.shopping.search.entity;

import java.util.Date;

/**
 * @author Achine
 * @date 2020/2/26
 */
public class SpuInfo {
    private String spuId;
    private String spuName;
    private String spuRemark;
    private Date listTime;
    private Integer spuNum;

    public String getSpuId() {
        return spuId;
    }

    public void setSpuId(String spuId) {
        this.spuId = spuId;
    }

    public String getSpuName() {
        return spuName;
    }

    public void setSpuName(String spuName) {
        this.spuName = spuName;
    }

    public String getSpuRemark() {
        return spuRemark;
    }

    public void setSpuRemark(String spuRemark) {
        this.spuRemark = spuRemark;
    }

    public Date getListTime() {
        return listTime;
    }

    public void setListTime(Date listTime) {
        this.listTime = listTime;
    }

    public Integer getSpuNum() {
        return spuNum;
    }

    public void setSpuNum(Integer spuNum) {
        this.spuNum = spuNum;
    }
}
