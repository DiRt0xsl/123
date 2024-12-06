package cn.tedu.jsd2307enjoymall.service;

import cn.tedu.jsd2307enjoymall.pojo.param.ProductParam;

/** * 商品管理Service接口 */

public interface IProductService {

    void regProduct(ProductParam productParam);

    int removeProduct(Long id);

}
