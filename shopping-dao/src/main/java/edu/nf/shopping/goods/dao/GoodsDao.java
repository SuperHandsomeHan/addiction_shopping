package edu.nf.shopping.goods.dao;

import edu.nf.shopping.goods.entity.GoodsInfo;

import java.util.List;

/**
 * @author Achine
 * @date 2020/3/5
 */
public interface GoodsDao {
    /**
     * 查询所有商品
     * @return
     */
    List<GoodsInfo> listGoods();

    /**
     * 根据名称查询所有商品
     * @return
     */
    List<GoodsInfo> listGoodsByName(String name);

    /**
     * 根据产品编号查询所有商品
     * @return
     */
    List<GoodsInfo> listGoodsBySpuId(String spuId);

    /**
     * 根据编号查询商品
     * @return
     */
    GoodsInfo listGoodsById(String id);

    /**
     * 添加商品
     * @param goodsInfo
     */
    void addGoods(GoodsInfo goodsInfo);

    /**
     * 批量修改商品
     * @param list
     */
    void updateGoods(List<GoodsInfo> list);

    /**
     * 批量删除商品
     * @param goodsId
     */
    void deleteGoods(String ... goodsId);
}
