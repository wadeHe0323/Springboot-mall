package com.wade.springbootmall.dao;

import com.wade.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
