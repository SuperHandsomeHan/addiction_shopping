package edu.nf.shopping.goods.entity;

/**
 * @author Achine
 * @date 2020/2/26
 */
public class GoodsImgs {
    private ImgsInfo img;
    private GoodsInfo good;
    private Integer img_index;

    public ImgsInfo getImg() {
        return img;
    }

    public void setImg(ImgsInfo img) {
        this.img = img;
    }

    public GoodsInfo getGood() {
        return good;
    }

    public void setGood(GoodsInfo good) {
        this.good = good;
    }

    public Integer getImg_index() {
        return img_index;
    }

    public void setImg_index(Integer img_index) {
        this.img_index = img_index;
    }
}
