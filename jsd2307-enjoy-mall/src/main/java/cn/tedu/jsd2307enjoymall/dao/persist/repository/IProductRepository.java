package cn.tedu.jsd2307enjoymall.dao.persist.repository;

import cn.tedu.jsd2307enjoymall.pojo.entity.Product;

public interface IProductRepository {

    int insert(Product product);

    int removeProduct(Long id);
}
