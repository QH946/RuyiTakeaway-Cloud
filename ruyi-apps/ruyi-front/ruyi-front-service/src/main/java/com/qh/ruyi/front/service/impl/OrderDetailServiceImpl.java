package com.qh.ruyi.front.service.impl;

import com.qh.ruyi.entity.OrderDetail;
import com.qh.ruyi.front.mapper.OrderDetailMapper;
import com.qh.ruyi.front.service.OrderDetailService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@DubboService(interfaceClass = OrderDetailService.class)
public class OrderDetailServiceImpl implements OrderDetailService {
    @Autowired
    private OrderDetailMapper orderDetailMapper;
    @Override
    public void saveBatch(List<OrderDetail> orderDetails) {
        for (OrderDetail orderDetail : orderDetails) {
            orderDetailMapper.insert(orderDetail);
        }
    }
}
