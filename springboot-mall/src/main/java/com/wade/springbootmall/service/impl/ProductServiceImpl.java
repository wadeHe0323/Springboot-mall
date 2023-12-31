package com.wade.springbootmall.service.impl;

import com.wade.springbootmall.dao.ProductDao;
import com.wade.springbootmall.model.Product;
import com.wade.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}
