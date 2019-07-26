

package com.ascetic_yuanma.tmall.mapper;

import com.ascetic_yuanma.tmall.pojo.Property;
import com.ascetic_yuanma.tmall.pojo.PropertyExample;
import java.util.List;

public interface PropertyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Property record);

    int insertSelective(Property record);

    List<Property> selectByExample(PropertyExample example);

    Property selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Property record);

    int updateByPrimaryKey(Property record);
}

