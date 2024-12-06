package cn.tedu.jsd2307enjoymall.dao.persist.repository.impl;


import cn.tedu.jsd2307enjoymall.dao.persist.mapper.ProductMapper;
import cn.tedu.jsd2307enjoymall.dao.persist.repository.IProductRepository;
import cn.tedu.jsd2307enjoymall.pojo.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepositoryImpl implements IProductRepository {

    @Autowired
    ProductMapper mapper;

    @Override
    public int insert(Product product) {
        return mapper.insert(product);
    }

    @Override
    public int removeProduct(Long id) {
        return mapper.deleteProduct(id);
    }
}
