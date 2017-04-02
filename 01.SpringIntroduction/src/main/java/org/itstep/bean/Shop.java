package org.itstep.bean;

import org.itstep.bean.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Shop {
    @Autowired
    public Product product;
}
