package edu.nf.shopping.order.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author Achine
 * @date 2020/3/4
 */
public class Order {
    private String orderId;
    private BigDecimal buyPrice;
    private BigDecimal cheapPrice;
    private BigDecimal transportPirce;
    private Date buyTime;
    private String buyUser;
    private String buyAdmin;
    private Integer collectRegion;
    private String collectAddress;
    private String buyRemark;
    private String orderRemark;
    private OrderState orderState;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public BigDecimal getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(BigDecimal buyPrice) {
        this.buyPrice = buyPrice;
    }

    public BigDecimal getCheapPrice() {
        return cheapPrice;
    }

    public void setCheapPrice(BigDecimal cheapPrice) {
        this.cheapPrice = cheapPrice;
    }

    public BigDecimal getTransportPirce() {
        return transportPirce;
    }

    public void setTransportPirce(BigDecimal transportPirce) {
        this.transportPirce = transportPirce;
    }

    public Date getBuyTime() {
        return buyTime;
    }

    public void setBuyTime(Date buyTime) {
        this.buyTime = buyTime;
    }

    public String getBuyUser() {
        return buyUser;
    }

    public void setBuyUser(String buyUser) {
        this.buyUser = buyUser;
    }

    public String getBuyAdmin() {
        return buyAdmin;
    }

    public void setBuyAdmin(String buyAdmin) {
        this.buyAdmin = buyAdmin;
    }

    public Integer getCollectRegion() {
        return collectRegion;
    }

    public void setCollectRegion(Integer collectRegion) {
        this.collectRegion = collectRegion;
    }

    public String getCollectAddress() {
        return collectAddress;
    }

    public void setCollectAddress(String collectAddress) {
        this.collectAddress = collectAddress;
    }

    public String getBuyRemark() {
        return buyRemark;
    }

    public void setBuyRemark(String buyRemark) {
        this.buyRemark = buyRemark;
    }

    public String getOrderRemark() {
        return orderRemark;
    }

    public void setOrderRemark(String orderRemark) {
        this.orderRemark = orderRemark;
    }

    public OrderState getOrderState() {
        return orderState;
    }

    public void setOrderState(OrderState orderState) {
        this.orderState = orderState;
    }
}
