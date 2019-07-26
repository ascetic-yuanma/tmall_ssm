

package com.ascetic_yuanma.tmall.mapper;

import com.ascetic_yuanma.tmall.pojo.Order;
import com.ascetic_yuanma.tmall.pojo.OrderExample;
import java.util.List;

public interface OrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Order record);

    int insertSelective(Order record);

    List<Order> selectByExample(OrderExample example);

    Order selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
}

