

package com.ascetic_yuanma.tmall.service;

import com.ascetic_yuanma.tmall.pojo.Product;
import com.ascetic_yuanma.tmall.pojo.PropertyValue;

import java.util.List;

public interface PropertyValueService {
    void init(Product p);
    void update(PropertyValue pv);

    PropertyValue get(int ptid, int pid);
    List<PropertyValue> list(int pid);
}


