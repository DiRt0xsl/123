package cn.tedu.jsd2307enjoymall.dao.persist.mapper;

import cn.tedu.jsd2307enjoymall.pojo.entity.Product;
import org.springframework.stereotype.Repository;

/** * 商品管理接口 */

@Repository
public interface ProductMapper {

    int insert(Product product);

    int deleteProduct(Long id);
}
