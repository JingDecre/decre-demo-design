package org.decre.demo.design;

import org.decre.demo.design.store.ICommodity;
import org.decre.demo.design.store.impl.CardCommodityService;
import org.decre.demo.design.store.impl.CouponCommodityService;
import org.decre.demo.design.store.impl.GoodsCommodityService;

/**
 * @className: StroreFactory
 * @description: 商店工厂
 * @author: decre
 * @date: 2021-4-28 22:04
 **/
public class StoreFactory {

    /**
     * 根据奖品类型下发不同
     *
     * @param commodityType
     * @return
     */
    public ICommodity getCommodityService(Integer commodityType) {
        ICommodity commodity;
        switch (commodityType) {
            case 1 -> commodity = new CouponCommodityService();
            case 2 -> commodity = new GoodsCommodityService();
            case 3 -> commodity = new CardCommodityService();
            default -> throw new RuntimeException("不存在的商品服务类型");
        }
        return commodity;
    }
}
