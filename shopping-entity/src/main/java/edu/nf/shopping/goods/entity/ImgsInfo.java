package edu.nf.shopping.goods.entity;

/**
 * @author Achine
 * @date 2020/2/26
 */
public class ImgsInfo {
    private String img_id;
    private String img_name;
    private String img_file;
    private ImgsType img_type;

    public String getImg_id() {
        return img_id;
    }

    public void setImg_id(String img_id) {
        this.img_id = img_id;
    }

    public String getImg_name() {
        return img_name;
    }

    public void setImg_name(String img_name) {
        this.img_name = img_name;
    }

    public String getImg_file() {
        return img_file;
    }

    public void setImg_file(String img_file) {
        this.img_file = img_file;
    }

    public ImgsType getImg_type() {
        return img_type;
    }

    public void setImg_type(ImgsType img_type) {
        this.img_type = img_type;
    }
}
