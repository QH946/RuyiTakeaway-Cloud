package com.qh.ruyi.front.service;

import com.qh.ruyi.entity.OrderDetail;

import java.util.List;

public interface OrderDetailService {
    void saveBatch(List<OrderDetail> orderDetails);
}
