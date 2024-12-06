package cn.tedu.jsd2307enjoymall.service.impl;

import cn.tedu.jsd2307enjoymall.dao.persist.repository.IProductRepository;
import cn.tedu.jsd2307enjoymall.pojo.param.ProductParam;
import cn.tedu.jsd2307enjoymall.pojo.entity.Product;
import cn.tedu.jsd2307enjoymall.service.IProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Date;

/** * 商品管理 Service层  @Service  */

@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    IProductRepository repository;

    public void regProduct(@RequestBody ProductParam productDTO){
        Product product = new Product();
        BeanUtils.copyProperties(productDTO , product);
        product.setCreateTime(new Date());
        System.out.println("Product = " + product);
        repository.insert(product);
    }

    @Override
    public int removeProduct(Long id) {
        return repository.removeProduct(id);
    }
}
