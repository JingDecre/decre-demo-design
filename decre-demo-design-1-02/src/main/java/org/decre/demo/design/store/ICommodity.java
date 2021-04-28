package org.decre.demo.design.store;

import java.util.Map;

/**
 * @className: ICommodity
 * @description: 发奖接口
 * @author: decre
 * @date: 2021-4-28 22:05
 **/
public interface ICommodity {

    void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception;

}
