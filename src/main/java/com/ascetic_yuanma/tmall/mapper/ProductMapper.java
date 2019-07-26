

package com.ascetic_yuanma.tmall.mapper;

import com.ascetic_yuanma.tmall.pojo.Product;
import com.ascetic_yuanma.tmall.pojo.ProductExample;
import java.util.List;

public interface ProductMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Product record);

    int insertSelective(Product record);

    List<Product> selectByExample(ProductExample example);

    Product selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);
}

